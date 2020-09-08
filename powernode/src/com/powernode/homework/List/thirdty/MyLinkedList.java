package com.powernode.homework.List.thirdty;

public class MyLinkedList {
    Node header;
    int length = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Node header) {
        this.header = header;
    }
    public Node next(Node n){//获取接下来Node里next是null的节点。
        if (n == null) {
            return header;
        }
        Node node = n.next;
        if(node != null){
            n = this.next(node);
        }
        return n;

    }
    public void add(Object o){
        Node newNode = new Node(o);
        Node node = this.next(header);
        if (node == null) {
            header = newNode;
        }
        else {
            node.next = newNode;
        }
        length ++;
    }
    public void delete(Object o){
        Node n = header;
        Node before = null;
        if (o.equals(header.data)){
            if (header.next != null){
                header = header.next;
                length --;
                return;
            }
            header = null;
            length --;
            return;
        }
        while(n != null){
            if (o.equals(n.data)) {
                before.next = n.next;
                length--;
                break;
            }
            before = n;
            n = n.next;

        }
    }
}
