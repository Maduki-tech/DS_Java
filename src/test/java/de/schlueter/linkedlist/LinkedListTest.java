package de.schlueter.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void linkedTest(){
        LinkedList sut = new LinkedList();
        sut.add(1);
        sut.add(2);
        sut.add(3);

        assertEquals(0,1);

    }


}
