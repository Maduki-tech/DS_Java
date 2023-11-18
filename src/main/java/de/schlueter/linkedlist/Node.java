package de.schlueter.linkedlist;

public class Node{
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }
}

