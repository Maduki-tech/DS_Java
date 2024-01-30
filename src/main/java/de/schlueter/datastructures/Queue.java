package de.schlueter.datastructures;

/**
 * Queue
 */
public class Queue {
    private int size, front, rear, count;
    private int elements[];

    public Queue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.elements = new int[size];
    }

    public void enqueue(int value) {
        if (this.count == this.size) {
            throw new IllegalStateException("Queue is full");
        }

        this.elements[this.rear] = value;
        this.rear = (this.rear + 1) % this.size;
        this.count++;
    }

    public int dequeue() {
        if (count == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = this.elements[this.front];
        this.front = (this.front + 1) % this.size;
        this.count--;
        return value;
    }
}
