package de.schlueter.linkedlist;

public class LinkedList{
    private Node head;
    private Node tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void add(int value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void print(){
        Node node = this.head;
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public void setByIndex(int index, int value){
        Node node = this.head;
        int i = 0;
        while(node != null){
            if(i == index){
                node.setNext(new Node(value));
                break;
            }
            node = node.getNext();
            i++;
        }
    }


    public int getByIndexs(int index){
        Node node = this.head;
        int i = 0;
        while(node != null){
            if (i == index){
                return node.getValue();
            }
            node = node.getNext();
            i++;
        }

        throw new RuntimeException("No Node with this value found");

    }


}
