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
    void pushOneElementTest() {

        myNewStack.push(5);
        assertEquals(5, myNewStack.peek());
    }

    @Test
    void pushTwoElementsTest() {
        myNewStack.push(8);
        myNewStack.push(9);
        assertEquals(9, myNewStack.peek());
    }

    @Test
    void pushTwoElements_popOneTest() {
        myNewStack.push(4);
        myNewStack.push(11);

        assertEquals(11, myNewStack.pop());
        assertEquals(4, myNewStack.peek());

    }

    @Test
    void pushTwoPopTwoShouldBeEmpty() {
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.pop();
        myNewStack.pop();
        assertTrue(myNewStack.isEmpty());
    }

    @Test
    void pushThreeShouldBefULL() {
        myNewStack = new MyNewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(3);

        assertTrue(myNewStack.isFull());
    }

    @Test
    void pushOneElementAfterStackIsFullThrowsStackOverflow() {
        myNewStack = new MyNewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(3);
        assertTrue(myNewStack.isFull());

        assertThrows(MyNewStack.StackOverflowException.class, () -> myNewStack.push(5));
    }

    @Test
    void removeLastElementWhenStackIsEmpty_ThrowsStackUnderFlow(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderflowException.class, ()->myNewStack.pop());
    }

    @Test
    void peekEmptyStack_throwsStackUnderFlowException(){
        assertTrue(myNewStack.isEmpty());
        assertThrows(MyNewStack.StackUnderflowException.class,()->myNewStack.peek());
    }

}



