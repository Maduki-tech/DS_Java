package de.schlueter.datastructures;

/**
 * Queue
 */
public class Queue {
    private int size, front, rear;
    private int elements[];

    public Queue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.elements = new int[size];
    }

    public void enqueue(int value) {
        if (front > size) {
            throw new OutOfMemoryError("No Memory");
        }

        this.elements[this.rear] = value;
        this.rear++;
    }

    public int dequeue() {
        if(rear < 0){
            throw new OutOfMemoryError("No Memory");
        }

        return this.elements[this.front++];


    }
}
