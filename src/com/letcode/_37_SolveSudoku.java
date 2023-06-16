package com.letcode;

public class _37_SolveSudoku {
    //使用递归，回溯的方式
    private boolean solveSudokuHelper(char[][] board){
        //「一个for循环遍历棋盘的行，一个for循环遍历棋盘的列，
        // 一行一列确定下来之后，递归遍历这个位置放9个数字的可能性！」
        for (int i = 0; i < 9; i++){ // 遍历行
            for (int j = 0; j < 9; j++){ // 遍历列
                if (board[i][j] != '.'){ // 跳过原始数字 //数独部分空格内已填入了数字，空白格用 '.' 表示
                    continue;
                }
                for (char k = '1'; k <= '9'; k++){ // (i, j) 这个位置放k是否合适
                    if (isValidSudoku(i, j, k, board)){
                        board[i][j] = k;
                        if (solveSudokuHelper(board)){ // 如果找到合适一组立刻返回 布尔类型
                            return true;
                        }
                        board[i][j] = '.';  //回溯
                    }
                }
                // 9个数都试完了，都不行，那么就返回false
                return false;
                // 因为如果一行一列确定下来了，这里尝试了9个数都不行，说明这个棋盘找不到解决数独问题的解！
                // 那么会直接返回， 「这也就是为什么没有终止条件也不会永远填不满棋盘而无限递归下去！」
            }
        }
        // 遍历完没有返回false，说明找到了合适棋盘位置了
        return true;
    }

    /**
     * 判断棋盘是否合法有如下三个维度:
     *     同行是否重复
     *     同列是否重复
     *     9宫格里是否重复
     */
    private boolean isValidSudoku(int row, int col, char val, char[][] board){
        // 同行是否重复--遍历列
        for (int i = 0; i < 9; i++){
            if (board[row][i] == val){
                return false;
            }
        }
        // 同列是否重复--遍历行
        for (int j = 0; j < 9; j++){
            if (board[j][col] == val){
                return false;
            }
        }
        // 9宫格里是否重复
        //确定当前单元格所属的 3x3 小九宫格的起始行索引。这是为了检查当前单元格所在的小九宫格中是否存在重复的值。
        // 九宫格中的行索引和列索引都是从 0 到 8，总共有 9 行和 9 列。每个小九宫格都是一个 3x3 的子矩阵。为了
        // 确定当前单元格所属的小九宫格，需要将行索引和列索引除以 3 取整，然后再乘以 3。例如，如果 row 是 4，那
        // 么 (row / 3) * 3 的结果就是 3。这意味着当前单元格所在的小九宫格的起始行索引是 3。同样地，对于列索引，
        // 也需要进行类似的操作来确定当前单元格所属的小九宫格的起始列索引。
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++){
            for (int j = startCol; j < startCol + 3; j++){
                if (board[i][j] == val){
                    return false;
                }
            }
        }
        return true;
    }

//    public boolean isValue(int i,int j,int k,int [][] board){
//        for (int i1 = 0; i1 < 9; i1++) {
//            if (board[i][i1] == k) {
//                return false;
//            }
//            if (board[i1][j] == k) {
////                return fals
//            }
//        }
//
//    }
}
