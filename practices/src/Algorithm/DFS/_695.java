package Algorithm.DFS;

//https://leetcode.com/problems/max-area-of-island/description/

import java.awt.*;
import java.util.Stack;

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

    static class Point {
        int row;
        int column;

        Point(int row, int column) {
            this.row = row;
            this.column = column;
        }
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

    public static int maxAreaOfIsland2(int[][] grid) {
        int rows = grid.length, columns = grid[0].length;
        int maxArea = 0;
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < columns; c++) {
                if(grid[r][c] == 1)
                    maxArea = Math.max(maxArea, dfs2(grid, r, c));
            }
        }
        return maxArea;
    }

    private static int dfs2(int[][] grid, int r, int c) {
        int rows = grid.length, columns = grid[0].length;
        Stack<Point> stack = new Stack();
        stack.push(new Point(r,c));

        int area = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,-1}, {0,1}};

        while(!stack.isEmpty()) {
            Point point = stack.pop();
            if(point.row >= 0 && point.row < rows
                    && point.column >= 0 && point.column < columns
                    && grid[point.row][point.column] == 1) {
                grid[point.row][point.column] = 0;
                area += 1;

                for(int[] direction : directions) {
                    stack.push(new Point(point.row + direction[0], point.column + direction[1]));
                }

            }
        }

        return area;
    }

    public static void main(String[] args) {
//        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                {0,0,0,0,0,0,0,1,1,0,0,0,0}}; //6

        int[][] grid = {{0,0,0,0,0,0,0,0}}; //0

//        System.out.println(maxAreaOfIsland(grid));
        System.out.println(maxAreaOfIsland2(grid));

    }
}
