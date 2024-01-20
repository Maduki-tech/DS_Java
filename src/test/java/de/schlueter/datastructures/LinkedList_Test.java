package de.schlueter.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkedList_Test {

    @Test
    void printLength_Test() {
        LinkedList sut = new LinkedList();

        sut.addNode(1);
        sut.addNode(3);
        sut.addNode(4);
        sut.addNode(8);
        sut.addNode(6);
        sut.addNode(0);

        assertEquals(6, sut.length());
    }

    @Test
    void delete_Test(){
        LinkedList sut = new LinkedList();

        sut.addNode(1);
        sut.addNode(3);
        sut.addNode(4);
        sut.addNode(8);
        sut.addNode(6);
        sut.addNode(0);

        int res = sut.removeByIndex(2);

        assertEquals(4, res);
        assertEquals(5, sut.length());

        System.out.println(sut.length());



    }
}
