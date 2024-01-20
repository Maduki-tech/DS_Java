package de.schlueter.datastructures;

public class LinkedList {
    Node head;
    Node tail;

    static class Node {
        Node node;
        int value;

        Node(int value) {
            this.value = value;
            this.node = null;
        }
    }

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Add a node to the head of the list
     *
     * @param value 
     * @return 
     */
    public Node addNode(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            while (tail.node != null) {
                tail = tail.node;
            }

            tail.node = temp;
        }
        return head;
    }

    /**
     * Print the full linked list
     */
    public void print() {
        Node p = head;
        while (p != null) {
            System.out.println(p.value);
            p = p.node;
        }
    }

    /**
     * Get the node by its **index**
     *
     * @param index 
     * @return 
     */
    public int getNode(int index) {
        Node result = head;
        int i = 0;
        while(result != null){
            if(i == index){
                return result.value;
            }

            result = result.node;
            i++;
        }

        return 0;
    }

    /**
     * Get the Length of the Linked List
     *
     * @return Length of the linked list
     */
    public int length() {
        int result = 0;
        Node p = head;

        while (p != null) {
            result++;
            p = p.node;
        }

        return result;
    }

    /**
     * Remove Value by its index and return it
     *
     * @param index 
     * @return 
     */
    public int removeByIndex(int index){
        int value = 0;
        int i = 0;
        Node p = head;
        while (p != null){
            if(i == index){
                p.node = p.node.node;
                value = p.value;
                break;
            }
            p = p.node;
            i++;
        }
        return value;
    }

}
