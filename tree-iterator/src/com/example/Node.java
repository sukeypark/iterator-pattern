package com.example;

public abstract class Node {

    private Node left;

    private Node right;

    public <T extends Node> T getLeft() {
        return (T) left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public <T extends Node> T getRight() {
        return (T) right;
    }

    public <T extends Node> void setRight(T right) {
        this.right = right;
    }

}
