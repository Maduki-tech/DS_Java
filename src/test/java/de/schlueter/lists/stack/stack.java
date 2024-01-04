package de.schlueter.lists.stack;

import org.junit.jupiter.api.Test;

/**
 * stack
 */
public class stack {
    @Test
    void stackTest() {
        int[] input = {2, 5, 3, 4, 8};
        Stack<Integer> stack = new Stack<Integer>(5);
        for (int number : input) {
            stack.push(number);
        }

        try {
            assert stack.pop() == 8;
            assert stack.pop() == 4;
            assert stack.pop() == 3;
            assert stack.pop() == 5;
            assert stack.pop() == 2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
