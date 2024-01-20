package de.schlueter.datastructures;

/**
 * Stack
 */
public class Stack {
    int maxSize;
    int top;
    Node[] items;

    static class Node {
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    Stack(int size) {
        this.maxSize = size;
        this.top = 0;
        this.items = new Node[size];
    }

    public void push(Node item) throws Exception {
        if (this.top == this.maxSize) {
            throw new Exception("Max size Limit");
        }
        this.items[this.top] = item;
        this.top++;
    }

    public Node pop() throws Exception {
        if (this.top == 0) {
            throw new Exception("No Elements");
        }

        this.top--;
        return this.items[this.top];
    }
}
