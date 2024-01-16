package Algorithm.DFS;

//https://leetcode.com/problems/max-area-of-island/description/

public class _695 {

    public static int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length, columns = grid[0].length;
        int maxArea = 0;
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                maxArea = Math.max(maxArea, dfs(grid, r, c));
            }
        }
        return maxArea;

    }

    private static int dfs(int[][] grid, int r, int c) {
        int rows = grid.length, columns = grid[0].length;
        if(r < 0 || r >= rows || c < 0 || c >= columns || grid[r][c] == 0) return 0;

        int ans = 1;
        grid[r][c] = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,-1}, {0,1}};

        for(int[] direction : directions) {
            ans += dfs(grid,r + direction[0], c + direction[1]);
        }

        return ans;

    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid)); //6

    }
}
