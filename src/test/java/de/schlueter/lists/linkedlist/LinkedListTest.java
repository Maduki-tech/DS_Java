package de.schlueter.lists.linkedlist;

import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    void LinkedTest() {
        int[] input = {2, 5, 3, 4, 8};
        LinkedList linkedList = new LinkedList();
        for (int number : input) {
            linkedList.add(number);
        }

        assert linkedList.getByIndexs(0) == 2;
        assert linkedList.getByIndexs(1) == 5;
        assert linkedList.getByIndexs(2) == 3;
        assert linkedList.getByIndexs(3) == 4;
        assert linkedList.getByIndexs(4) == 8;
    }
}
