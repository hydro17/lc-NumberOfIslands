package com.company;

public class Main {

    public static void main(String[] args) {

        char[][] island = {
                {'0', '1'},
                {'1', '0'}
        };

        new Solution().numIslands(island);
    }
}
