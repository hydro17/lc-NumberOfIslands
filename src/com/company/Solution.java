package com.company;

import java.util.Arrays;

class Solution {
    public int numIslands(char[][] grid) {

        if (grid.length == 0) return 0;

        int islandsCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islandsCount++;
                    markIslandPieces(i, j, grid);
                }
            }
        }

        return islandsCount;
    }

    private void markIslandPieces(int i, int j, char[][] grid) {
        if (grid[i][j] == '2' || grid[i][j] == '0') return;

        grid[i][j] = '2';

        if (i - 1 >= 0) {
            markIslandPieces(i - 1, j, grid);
        }

        if (j + 1 < grid[i].length) {
            markIslandPieces(i , j + 1, grid);
        }

        if (i + 1 < grid.length) {
            markIslandPieces(i + 1, j, grid);
        }

        if (j - 1 >= 0) {
            markIslandPieces(i, j - 1, grid);
        }
    }
}
