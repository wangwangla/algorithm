package com.labuladong._4_chapterfour;

public class _421_SolveSudoku {

    void solveSudoku(char [][] board){

    }

    void backtrack(char[][] board,int i,int j) {
        int m = 9;
        int n = 9;
        if (j == n){
            backtrack(board,i+1,0);
            return;
        }
        if (board[i][j] != '.'){
            backtrack(board,i,j+1);
        }
        for (char ch = '1';ch <= '9';ch++){
            if(isVaild(board,i,j,ch)){
                continue;
            }
            board[i][j] = ch;
            backtrack(board,i,j+1);
            board[i][j] = '.';
        }
    }

    private boolean isVaild(char[][] board, int i, int j, char ch) {
        for (int i1 = 0; i1 < 9; i1++) {
            if (board[i][i1] == ch){
                return false;
            }
            if (board[i][j] == ch){
                return false;
            }
            if (board[(i/3)*3 + i1/3][(j/3)*3+i%3] == ch){
                return false;
            }
        }
        return true;
    }
}
