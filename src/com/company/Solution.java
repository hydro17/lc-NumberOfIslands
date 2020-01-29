package com.company;

import java.util.Arrays;

class Solution {
    public int numIslands(char[][] grid) {

        if (grid.length == 0) return 0;

        byte[][] gridAsByte = new byte[grid.length][grid[0].length];

        int islandsCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                gridAsByte[i][j] = (grid[i][j] == '1') ? (byte)1 : (byte)0;
            }
        }

        for (int i = 0; i < gridAsByte.length; i++) {
            for (int j = 0; j < gridAsByte[i].length; j++) {
                if (gridAsByte[i][j] == (byte)1) {
                    islandsCount++;
                    markIslandPieces(i, j, gridAsByte);
                }
            }
        }

        return islandsCount;
    }

    private void markIslandPieces(int i, int j, byte[][] gridAsByte) {
        if (gridAsByte[i][j] == (byte)2 || gridAsByte[i][j] == (byte)0) return;

        gridAsByte[i][j] = (byte)2;

        if (i - 1 >= 0) {
            markIslandPieces(i - 1, j, gridAsByte);
        }

        if (j + 1 < gridAsByte[i].length) {
            markIslandPieces(i , j + 1, gridAsByte);
        }

        if (i + 1 < gridAsByte.length) {
            markIslandPieces(i + 1, j, gridAsByte);
        }

        if (j - 1 >= 0) {
            markIslandPieces(i, j - 1, gridAsByte);
        }
    }
}
