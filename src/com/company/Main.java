package com.company;

public class Main {

    public static void main(String[] args) {

        char[][] island = {
                {'0', '1', '0'},
                {'1', '1', '1'},
                {'0', '1', '0'}
        };

        int numIslands = new Solution().numIslands(island);
        System.out.println(numIslands);
    }
}
