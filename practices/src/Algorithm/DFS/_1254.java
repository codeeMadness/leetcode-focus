package Algorithm.DFS;

//https://leetcode.com/problems/number-of-closed-islands/description/

public class _1254 {
    public static int closedIsland(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;

        int ans = 0;
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                if(grid[r][c] == 0)
                    ans += dfs(grid,r,c) ? 1 : 0;
            }
        }

        return ans;

    }

    private static boolean dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int columns = grid[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= columns) return false;

        if(grid[r][c] == 1) return true;

        grid[r][c] = 1;

        boolean goLeft = dfs(grid, r, c-1);
        boolean goRight = dfs(grid, r, c+1);
        boolean goTop = dfs(grid, r-1, c);
        boolean goBottom = dfs(grid, r+1, c);

        return goLeft && goRight && goTop && goBottom;
    }

    public static void main(String[] args) {
//        int[][] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}}; //2
//        int[][] grid = {{0,0,1,0,0},{0,1,0,1,0},{0,1,1,1,0}}; //1
        int[][] grid = {{1,1,1,1,1,1,1},
               {1,0,0,0,0,0,1},
               {1,0,1,1,1,0,1},
               {1,0,1,0,1,0,1},
               {1,0,1,1,1,0,1},
               {1,0,0,0,0,0,1},
               {1,1,1,1,1,1,1}}; //2
        System.out.println(closedIsland(grid));
    }

}
