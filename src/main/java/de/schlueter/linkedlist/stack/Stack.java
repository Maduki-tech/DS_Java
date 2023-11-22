package de.schlueter.linkedlist.stack;

/**
 * Stack
 */
public class Stack<T> {
    T[] elem;
    int top = 0;

    public Stack(int size) {
        this.elem = (T[]) new Object[size];
    }

    public T pop() throws Exception {
        T value;
        if (this.top == 0) {
            throw new Exception("Overflow");
        } else {
            this.top = this.top - 1;
            value = this.elem[this.top];
            this.elem[this.top] = null;
        }
        return value;
    }

    public void push(T element) {
        this.elem[top] = element;
        this.top = this.top + 1;
    }

    public void printAll() {
        for (T element : elem) {
            System.out.println(element);
        }
    }
}
