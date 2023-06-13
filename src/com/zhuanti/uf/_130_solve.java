package com.zhuanti.uf;

public class _130_solve {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[0].length; i1++) {
                if (board[i][i1] == 'O'){
                    if (check(board,i,i1)) {
                        board[i][i1] = 'X';
                    }
                }
            }
        }
    }

    public boolean check(char[][] chars,int x,int y){
        int count = 0;
        for (int i = x-1; i >=0; i--) {
            if (chars[i][y]=='X'){
                count++;
                break;
            }
        }
        for (int i = x+1; i <chars.length; i++) {
            if (chars[i][y]=='X'){
                count++;
                break;
            }
        }
        for (int i = y-1; i >=0; i--) {
            if (chars[x][i]=='X'){
                count++;
                break;
            }
        }
        for (int i = y+1; i <chars[0].length; i++) {
            if (chars[x][i]=='X'){
                count++;
                break;
            }
        }
        if (count==4)return true;
        return false;
    }

    public static void main(String[] args) {
//        char[][] chars = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
//        char[][] chars = {{'O','O'},{'O','O'}};
//        char[][] chars ={{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
        char[][] chars ={{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        _130_solve solve = new _130_solve();
        solve.solve(chars);

    }
}
