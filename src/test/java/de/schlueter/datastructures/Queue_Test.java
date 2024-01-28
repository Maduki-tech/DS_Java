package de.schlueter.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Queue_Test
 */
public class Queue_Test {
    @Test
    void createQueue_test() {
        Queue sut = new Queue(5);

        sut.enqueue(2);
        sut.enqueue(1);
        sut.enqueue(8);
        sut.enqueue(7);
        sut.enqueue(5);

        assertEquals(2, sut.dequeue());
        assertEquals(1, sut.dequeue());
        assertEquals(8, sut.dequeue());

        sut.enqueue(4);
        sut.enqueue(1);

        assertEquals(7, sut.dequeue());
        assertEquals(5, sut.dequeue());
        assertEquals(4, sut.dequeue());
        assertEquals(1, sut.dequeue());



    }
}
