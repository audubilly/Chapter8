package DataStructureImpl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNewStackTest {

    MyNewStack myNewStack;
    @BeforeEach
    void setUp() {
        myNewStack = new MyNewStack(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pushOneElementTest(){

        myNewStack.push(5);
        assertEquals(5, myNewStack.peek());
    }

    @Test
    void pushTwoElementsTest(){
        myNewStack.push(8);
        myNewStack.push(9);
        assertEquals(9,myNewStack.peek());
    }

    @Test
    void pushTwoElements_popOneTest(){
        myNewStack.push(4);
        myNewStack.push(11);

        assertEquals(11,myNewStack.pop());
        assertEquals(4,myNewStack.peek());

    }
}