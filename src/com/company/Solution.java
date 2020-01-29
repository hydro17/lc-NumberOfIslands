package com.company;

import java.util.Arrays;

class Solution {
    public int numIslands(char[][] grid) {

        if (grid.length == 0) return 0;

        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int islandsCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!isVisited[i][j] && grid[i][j] == '1') {
                    islandsCount++;
                    markIslandPieces(i, j, grid, isVisited);
                }
            }
        }

        return islandsCount;
    }

    private void markIslandPieces(int i, int j, char[][] grid, boolean[][] isVisited) {
        if (isVisited[i][j] || grid[i][j] == '0') return;

        isVisited[i][j] = true;

        if (i - 1 >= 0) {
            markIslandPieces(i - 1, j, grid, isVisited);
        }

        if (j + 1 < grid[i].length) {
            markIslandPieces(i , j + 1, grid, isVisited);
        }

        if (i + 1 < grid.length) {
            markIslandPieces(i + 1, j, grid, isVisited);
        }

        if (j - 1 >= 0) {
            markIslandPieces(i, j - 1, grid, isVisited);
        }
    }
}
