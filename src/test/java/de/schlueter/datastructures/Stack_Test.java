package de.schlueter.datastructures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.schlueter.datastructures.Stack.Node;

/**
 * Stack_Test
 */
public class Stack_Test {

    @Test
    void createStack_Test() throws Exception{
        Stack sut = new Stack(8);

        sut.push(new Node(2));
        sut.push(new Node(3));
        sut.push(new Node(8));
        sut.push(new Node(9));

        assertEquals(9, sut.pop().value);

    }
    
}
