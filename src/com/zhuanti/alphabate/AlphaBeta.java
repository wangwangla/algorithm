package com.zhuanti.alphabate;
public class AlphaBeta {
    public static int alphaBeta(int depth, int nodeIndex, int alpha, int beta, boolean maximizingPlayer, int[] values) {
        if (depth == 0) {
            return values[nodeIndex];
        }

        if (maximizingPlayer) {
            int bestValue = Integer.MIN_VALUE;

            for (int i = 0; i < 2; i++) {
                int value = alphaBeta(depth - 1, nodeIndex * 2 + i, alpha, beta, false, values);
                bestValue = Math.max(bestValue, value);
                alpha = Math.max(alpha, bestValue);

                if (beta <= alpha) {
                    break;
                }
            }

            return bestValue;
        } else {
            int bestValue = Integer.MAX_VALUE;

            for (int i = 0; i < 2; i++) {
                int value = alphaBeta(depth - 1, nodeIndex * 2 + i, alpha, beta, true, values);
                bestValue = Math.min(bestValue, value);
                beta = Math.min(beta, bestValue);

                if (beta <= alpha) {
                    break;
                }
            }

            return bestValue;
        }
    }

    public static void main(String[] args) {
        int[] values = {3, 5, 6, 9, 1, 2, 0, -1};
        int result = alphaBeta(3, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, true, values);
        System.out.println("最优解为：" + result);
    }


}
