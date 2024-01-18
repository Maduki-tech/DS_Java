package de.schlueter.datastructures;

import org.junit.jupiter.api.Test;

public class LinkedList_Test {
    @Test
    void test(){
        LinkedList sut = new LinkedList();
        sut.addNode(1);
        sut.addNode(3);
        sut.addNode(4);
        sut.addNode(8);
        sut.addNode(6);
        sut.addNode(0);

        sut.print();

    }

    
}
