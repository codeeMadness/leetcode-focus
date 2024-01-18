package Algorithm.DFS;

//https://leetcode.com/problems/battleships-in-a-board/description/

public class _419 {
    public static int countBattleships(char[][] board) {
        int rows = board.length;
        int columns = board[0].length;
        int count = 0;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                if(board[r][c] == 'X') {
                    count++;
                    dfs(board, r, c);
                }
            }
        }

        return count;

    }

    private static void dfs(char[][] board, int r, int c) {
        int rows = board.length;
        int columns = board[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= columns) return;
        if(board[r][c] == '.') return;

        board[r][c] = '.';

        dfs(board, r-1, c); //up
        dfs(board, r+1, c); //down
        dfs(board, r, c-1); //left
        dfs(board, r, c+1); //right

    }
    public static void main(String[] args) {
//        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}; //2
        char[][] board = {{'.'}};//0
        System.out.println(countBattleships(board));
    }
}
