package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private char val;
    private boolean isVisited = false;
    private List<Node> neighbours = new ArrayList<>();

    public Node(char val) {
        this.val = val;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", isVisited=" + isVisited +
                ", neighbours=" + neighbours +
                '}';
    }
}
