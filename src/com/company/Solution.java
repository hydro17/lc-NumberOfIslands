package com.company;

import java.util.Arrays;

class Solution {
    public int numIslands(char[][] grid) {

        Node[][] gridAsNodes = new Node[grid.length][grid[0].length];

        for (char[] g : grid) {
            System.out.println(Arrays.toString(g));
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[i].length; j++) {
                gridAsNodes[i][j] = new Node(grid[i][j]);
            }
        }

        for (int i = 0; i < gridAsNodes.length; i++) {
            for (int j = 0; j <gridAsNodes[i].length; j++) {
                if (i - 1 > 0) {
                    gridAsNodes[i][j].getNeighbours().add(gridAsNodes[i - 1][j]);
                }
                if (j + 1 < gridAsNodes[i].length) {
                    gridAsNodes[i][j].getNeighbours().add(gridAsNodes[i][j + 1]);
                }
                if (i + 1 < gridAsNodes.length) {
                    gridAsNodes[i][j].getNeighbours().add(gridAsNodes[i + 1][j]);
                }
                if (j - 1 > 0) {
                    gridAsNodes[i][j].getNeighbours().add(gridAsNodes[i][j - 1]);
                }
            }
        }

        for (Node[] n : gridAsNodes) {
            System.out.println(Arrays.toString(n));
        }

        return 0;
    }
}
