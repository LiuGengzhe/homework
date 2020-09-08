package com.powernode.homework.List.thirdty;

public class Node {
    Object data;
    Node next;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
