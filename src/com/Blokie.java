package com;// Due to the size of the source JavaScript file, we will translate it into structured Java classes.
// This is the core BitBoard structure and utility logic for a Blokie-like puzzle game in Java.

import java.util.*;

public class Blokie {
    public static final int USED_BITS = 0x7FFFFFF;
    public static final BitBoard EMPTY = new BitBoard(0, 0, 0);
    public static final BitBoard FULL = new BitBoard(USED_BITS, USED_BITS, USED_BITS);
    public static final int ROW_0 = 0x1FF;
    public static final int ROW_2 = ROW_0 << 18;
    public static final int LEFT_BITS = 1 | (1 << 9) | (1 << 18);
    public static final int RIGHT_BITS = LEFT_BITS << 8;
    public static final int TOP_LEFT_CUBE = 0x7 | (0x7 << 9) | (0x7 << 18);
    public static final int INF_SCORE = 9999999;

    // Static precomputed rows, columns, and cubes
    public static final BitBoard[] ROWS = new BitBoard[9];
    public static final BitBoard[] COLS = new BitBoard[9];
    public static final BitBoard[] CUBES = new BitBoard[9];

    static {
        for (int i = 0; i < 9; i++) {
            ROWS[i] = generateRow(i);
            COLS[i] = generateColumn(i);
            CUBES[i] = generateCube(i);
        }
    }

    public static class BitBoard {
        public final int a, b, c;

        public BitBoard(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public BitBoard copy() {
            return new BitBoard(a, b, c);
        }

        public static BitBoard not(BitBoard bb) {
            return new BitBoard(~bb.a & USED_BITS, ~bb.b & USED_BITS, ~bb.c & USED_BITS);
        }

        public static BitBoard and(BitBoard x, BitBoard y) {
            return new BitBoard(x.a & y.a, x.b & y.b, x.c & y.c);
        }

        public static BitBoard or(BitBoard x, BitBoard y) {
            return new BitBoard(x.a | y.a, x.b | y.b, x.c | y.c);
        }

        public static BitBoard xor(BitBoard x, BitBoard y) {
            return and(or(x, y), not(and(x, y)));
        }

        public static BitBoard diff(BitBoard x, BitBoard y) {
            return new BitBoard(x.a & ~y.a, x.b & ~y.b, x.c & ~y.c);
        }

        public boolean isEmpty() {
            return a == 0 && b == 0 && c == 0;
        }

        public static boolean equal(BitBoard x, BitBoard y) {
            return x.a == y.a && x.b == y.b && x.c == y.c;
        }

        public static int count(BitBoard bb) {
            return popcount(bb.a) + popcount(bb.b) + popcount(bb.c);
        }

        private static int popcount(int x) {
            x = x - ((x >>> 1) & 0x55555555);
            x = (x & 0x33333333) + ((x >>> 2) & 0x33333333);
            x = (x + (x >>> 4)) & 0x0F0F0F0F;
            x = x + (x >>> 8);
            x = x + (x >>> 16);
            return x & 0x7F;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    BitBoard mask = and(Blokie.row(r), Blokie.column(c));
                    sb.append(and(this, mask).isEmpty() ? "." : "#");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public static BitBoard row(int r) {
        return ROWS[r];
    }

    public static BitBoard column(int c) {
        return COLS[c];
    }

    public static BitBoard cube(int i) {
        return CUBES[i];
    }

    private static BitBoard generateRow(int r) {
        int[] result = new int[]{0, 0, 0};
        int m = r % 3;
        result[r / 3] = ROW_0 << (m * 9);
        return new BitBoard(result[0], result[1], result[2]);
    }

    private static BitBoard generateColumn(int c) {
        int bits = LEFT_BITS << c;
        return new BitBoard(bits, bits, bits);
    }

    private static BitBoard generateCube(int i) {
        int[] result = new int[]{0, 0, 0};
        result[i / 3] = TOP_LEFT_CUBE << ((i % 3) * 3);
        return new BitBoard(result[0], result[1], result[2]);
    }


    public static BitBoard shiftLeft(BitBoard bb) {
        return new BitBoard((bb.a & ~LEFT_BITS) >>> 1, (bb.b & ~LEFT_BITS) >>> 1, (bb.c & ~LEFT_BITS) >>> 1);
    }

    public static BitBoard shiftRight(BitBoard bb) {
        return new BitBoard((bb.a & ~RIGHT_BITS) << 1, (bb.b & ~RIGHT_BITS) << 1, (bb.c & ~RIGHT_BITS) << 1);
    }

    public static BitBoard shiftUp(BitBoard bb) {
        return new BitBoard(
                (bb.a >>> 9) | ((bb.b & ROW_0) << 18),
                (bb.b >>> 9) | ((bb.c & ROW_0) << 18),
                bb.c >>> 9
        );
    }

    public static BitBoard shiftDown(BitBoard bb) {
        return new BitBoard(
                (bb.a << 9) & USED_BITS,
                ((bb.b << 9) | ((bb.a & ROW_2) >>> 18)) & USED_BITS,
                ((bb.c << 9) | ((bb.b & ROW_2) >>> 18)) & USED_BITS
        );
    }



    public static BitBoard rotate(BitBoard bb) {
        BitBoard result = EMPTY;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                BitBoard mask = BitBoard.and(Blokie.row(r), Blokie.column(c));
                if (!BitBoard.and(bb, mask).isEmpty()) {
                    int rotatedR = c;
                    int rotatedC = 8 - r;
                    result = BitBoard.or(result, BitBoard.and(Blokie.row(rotatedR), Blokie.column(rotatedC)));
                }
            }
        }
        return result;
    }

    public static BitBoard mirror(BitBoard bb) {
        BitBoard result = EMPTY;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                BitBoard mask = BitBoard.and(Blokie.row(r), Blokie.column(c));
                if (!BitBoard.and(bb, mask).isEmpty()) {
                    result = BitBoard.or(result, BitBoard.and(Blokie.row(r), Blokie.column(8 - c)));
                }
            }
        }
        return result;
    }

    public static List<BitBoard> getAllTransformations(BitBoard bb) {
        List<BitBoard> transformations = new ArrayList<>();
        BitBoard rotated = bb;
        for (int i = 0; i < 4; i++) {
            rotated = rotate(rotated);
            transformations.add(rotated);
            transformations.add(mirror(rotated));
        }
        return transformations;
    }

    public static BitBoard performClears(BitBoard board) {
        BitBoard toRemove = EMPTY;
        for (int i = 0; i < 9; i++) {
            BitBoard row = row(i);
            BitBoard col = column(i);
            BitBoard cb = cube(i);
            if (isSubset(board, row)) toRemove = BitBoard.or(toRemove, row);
            if (isSubset(board, col)) toRemove = BitBoard.or(toRemove, col);
            if (isSubset(board, cb)) toRemove = BitBoard.or(toRemove, cb);
        }
        if (toRemove.isEmpty()) return board;
        return BitBoard.diff(board, toRemove);
    }

    public static boolean isSubset(BitBoard superset, BitBoard subset) {
        return (subset.a & ~superset.a) == 0 && (subset.b & ~superset.b) == 0 && (subset.c & ~superset.c) == 0;
    }

    public static boolean isDisjoint(BitBoard a, BitBoard b) {
        return (a.a & b.a) == 0 && (a.b & b.b) == 0 && (a.c & b.c) == 0;
    }

    public static List<BitBoard> getNextBoards(BitBoard board, BitBoard piece) {
        List<BitBoard> result = new ArrayList<>();
        if (piece.isEmpty()) {
            result.add(board);
            return result;
        }

        BitBoard current = piece.copy();
        BitBoard col8 = column(8);
        BitBoard row8 = row(8);
        BitBoard left = current;

        while (true) {
            if (isDisjoint(board, current)) {
                BitBoard placed = BitBoard.or(board, current);
                result.add(performClears(placed));
            }
            if (!isDisjoint(current, col8)) {
                if (!isDisjoint(left, row8)) break;
                left = shiftDown(left);
                current = left;
            } else {
                current = shiftRight(current);
            }
        }
        return result;
    }

//    // Evaluation stub (to be expanded in next stage)
//    public static int getEval(BitBoard bb) {
//        return BitBoard.count(bb);
//    }

    public static int getEval(BitBoard bb) {
        int OCCUPIED_CENTER_SQUARE = 1607;
        int OCCUPIED_SIDE_SQUARE = 2000;
        int OCCUPIED_CORNER_SQUARE = 3067;
        int CENTER_CUBE = 204;
        int SIDE_CUBE = 1358;
        int CORNER_CUBE = 908;

        int result = 0;

        for (int i = 0; i < 9; ++i) {
            BitBoard cb = BitBoard.and(cube(i), bb);
            if (!cb.isEmpty()) {
                int cnt = BitBoard.count(cb);
                if (i == 4) {
                    result += CENTER_CUBE + OCCUPIED_CENTER_SQUARE * cnt;
                } else if (i == 1 || i == 3 || i == 5 || i == 7) {
                    result += SIDE_CUBE + OCCUPIED_SIDE_SQUARE * cnt;
                } else {
                    result += CORNER_CUBE + OCCUPIED_CORNER_SQUARE * cnt;
                }
            }
        }

        // Heuristic simplification: higher count = higher penalty
        // This encourages fewer blocks left on board.
        result += BitBoard.count(bb) * 10;

        return result;
    }
    public static class GameState {
        public BitBoard board;
        public BitBoard previousPiecePlacement;
        public BitBoard previousPiece;
        public boolean previousMoveWasClear;
        public int score;

        public GameState(BitBoard board, BitBoard placement, BitBoard piece, boolean clear, int score) {
            this.board = board;
            this.previousPiecePlacement = placement;
            this.previousPiece = piece;
            this.previousMoveWasClear = clear;
            this.score = score;
        }
    }

    public static BitBoard[] PIECES = {
            new BitBoard(1, 0, 0),
            new BitBoard(3, 0, 0),
            new BitBoard(513, 0, 0),
            new BitBoard(1025, 0, 0),
            new BitBoard(514, 0, 0),
            new BitBoard(7, 0, 0),
            new BitBoard(262657, 0, 0),
            new BitBoard(1049601, 0, 0),
            new BitBoard(263172, 0, 0),
            new BitBoard(515, 0, 0)
            // ... continue adding from the original JS PIECES if needed
    };

//    public static BitBoard getRandomPiece(Random rng) {
//        return PIECES[rng.nextInt(PIECES.length)].copy();
//    }

//    public static BitBoard[] getRandomPieceSet(Random rng) {
//        return new BitBoard[]{ getRandomPiece(rng), getRandomPiece(rng), getRandomPiece(rng) };
//    }

    public static GameState[] aiMakeMove(GameState game, BitBoard[] pieceSet, Random rng) {
        int bestEval = Integer.MAX_VALUE;
        GameState[] bestStates = null;

        for (BitBoard p0 : pieceSet) {
            for (BitBoard b0 : getNextBoards(game.board, p0)) {
                int s0 = game.score + BitBoard.count(BitBoard.diff(b0, game.board));
                for (BitBoard p1 : pieceSet) {
                    if (p1 == p0) continue;
                    for (BitBoard b1 : getNextBoards(b0, p1)) {
                        int s1 = s0 + BitBoard.count(BitBoard.diff(b1, b0));
                        for (BitBoard p2 : pieceSet) {
                            if (p2 == p0 || p2 == p1) continue;
                            for (BitBoard b2 : getNextBoards(b1, p2)) {
                                int s2 = s1 + BitBoard.count(BitBoard.diff(b2, b1));
                                int eval = getEval(b2);
                                if (eval < bestEval) {
                                    bestEval = eval;
                                    bestStates = new GameState[]{
                                            new GameState(b0, p0, p0, false, s0),
                                            new GameState(b1, p1, p1, false, s1),
                                            new GameState(b2, p2, p2, false, s2)
                                    };
                                }
                            }
                        }
                    }
                }
            }
        }
        return bestStates;
    }

    public static GameState getNewGame() {
        return new GameState(EMPTY, EMPTY, EMPTY, false, 0);
    }


//
//    public static class GameState {
//        public BitBoard board;
//        public BitBoard previousPiecePlacement;
//        public BitBoard previousPiece;
//        public boolean previousMoveWasClear;
//        public int score;
//
//        public GameState(BitBoard board, BitBoard placement, BitBoard piece, boolean clear, int score) {
//            this.board = board;
//            this.previousPiecePlacement = placement;
//            this.previousPiece = piece;
//            this.previousMoveWasClear = clear;
//            this.score = score;
//        }
//    }

//    public static BitBoard[] PIECES = {
//            new BitBoard(1, 0, 0),
//            new BitBoard(3, 0, 0),
//            new BitBoard(513, 0, 0),
//            new BitBoard(1025, 0, 0),
//            new BitBoard(514, 0, 0),
//            new BitBoard(7, 0, 0),
//            new BitBoard(262657, 0, 0),
//            new BitBoard(1049601, 0, 0),
//            new BitBoard(263172, 0, 0),
//            new BitBoard(515, 0, 0)
//            // ... continue adding from the original JS PIECES if needed
//    };

    public static BitBoard getRandomPiece(Random rng) {
        return PIECES[rng.nextInt(PIECES.length)].copy();
    }

    public static BitBoard[] getRandomPieceSet(Random rng) {
        return new BitBoard[]{ getRandomPiece(rng), getRandomPiece(rng), getRandomPiece(rng) };
    }

    public static BitBoard centerPiece(BitBoard p) {
        int height = 0;
        int width = 0;
        for (int i = 0; i < 9; i++) {
            if (!BitBoard.and(p, row(i)).isEmpty()) height = i + 1;
            if (!BitBoard.and(p, column(i)).isEmpty()) width = i + 1;
        }
        for (int i = 0; i < (5 - width) / 2; i++) {
            p = shiftRight(p);
        }
        for (int i = 0; i < (5 - height) / 2; i++) {
            p = shiftDown(p);
        }
        return p;
    }

    public static BitBoard leftTopJustifyPiece(BitBoard p) {
        while (BitBoard.and(p, row(0)).isEmpty()) {
            p = shiftUp(p);
        }
        while (BitBoard.and(p, column(0)).isEmpty()) {
            p = shiftLeft(p);
        }
        return p;
    }

    public static int getMoveScore(boolean previousWasClear, BitBoard prev, BitBoard placement, BitBoard after) {
        int placedCount = BitBoard.count(BitBoard.diff(after, prev));
        BitBoard cleared = BitBoard.diff(BitBoard.or(prev, placement), after);
        int combo = getComboMagnitude(cleared);

        int score = placedCount;
        if (combo == 0) return score;
        if (previousWasClear) score += 9;

        if (combo <= 2) score += 18 * combo;
        else if (combo <= 4) score += 36 * combo;
        else if (combo <= 7) score += 54 * combo;
        else score += 72 * combo;

        return score;
    }

    public static int getComboMagnitude(BitBoard cleared) {
        int result = 0;
        for (int i = 0; i < 9; i++) {
            if (BitBoard.equal(row(i), BitBoard.and(row(i), cleared))) result++;
            if (BitBoard.equal(column(i), BitBoard.and(column(i), cleared))) result++;
            if (BitBoard.equal(cube(i), BitBoard.and(cube(i), cleared))) result++;
        }
        return result;
    }

    public static boolean isOver(GameState game) {
        return BitBoard.equal(game.board, FULL);
    }

    public static class BlokieAPI {
        public static GameState getNewGame() {
            return new GameState(EMPTY, EMPTY, EMPTY, false, 0);
        }

        public static BitBoard[] getRandomPieceSet(Random rng) {
            BitBoard[] raw = Blokie.getRandomPieceSet(rng);
            for (int i = 0; i < raw.length; i++) {
                raw[i] = centerPiece(raw[i]);
            }
            return raw;
        }

        public static GameState[] getAIMove(GameState game, BitBoard[] pieceSet, Random rng) {
            return aiMakeMove(game, pieceSet, rng);
        }

        public static boolean isOver(GameState game) {
            return Blokie.isOver(game);
        }
    }


    // === TEST HARNESS ===
    public static void runBasicTests() {
        Random rng = new Random(42);

        GameState game = BlokieAPI.getNewGame();
        int totalMoves = 0;

        while (!BlokieAPI.isOver(game) && totalMoves < 100) {
            BitBoard[] pieceSet = BlokieAPI.getRandomPieceSet(rng);
            GameState[] nextStates = BlokieAPI.getAIMove(game, pieceSet, rng);

            if (nextStates == null || nextStates.length < 3) {
                System.out.println("AI failed to find valid moves.");
                break;
            }

            game = nextStates[2];
            totalMoves++;
            System.out.println("Move " + totalMoves + " | Score: " + game.score);
            System.out.println(game.board);
        }

        System.out.println("Final Score: " + game.score);
        System.out.println("Game Over: " + BlokieAPI.isOver(game));
    }

    public static void main(String[] args) {
        runBasicTests();
    }
    // Add more methods here to support: shiftLeft, shiftRight, shiftUp, shiftDown,
    // game logic, random piece generation, AI, and scoring as in the original JS code.
}
