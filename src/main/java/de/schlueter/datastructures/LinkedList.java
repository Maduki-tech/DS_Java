package de.schlueter.datastructures;

public class LinkedList {
    Node head;

    static class Node {
        Node node;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    LinkedList() {
    }

    public Node addNode(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = new Node(value);
        } else {
            Node p = head;
            while (p.node != null) {
                p = p.node;
            }

            p.node = temp;
        }
        return head;
    }

    public void print() {
        Node p = head;
        while(p != null){
            System.out.println(p.value);
            p = p.node;
        }
    }

}
