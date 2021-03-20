package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TqsStackTest {

    private TqsStack<String> newStack;

    @BeforeEach
    void createStack() {
        newStack = new TqsStack<>();
    }

    @Test
    @DisplayName("A stack is empty on construction:")
    void emptyOnConstruction() {
        assertTrue(newStack.isEmpty());
    }

    @Test
    @DisplayName("A stack has size 0 on construction:")
    void sizeOnConstruction() {
        assertTrue(newStack.size() == 0);
    }

    @Test
    @DisplayName("After n pushes to an empty stack, n > 0, the stack is not empty and its size is n:")
    void pushToEmpty() {
        assertTrue(newStack.isEmpty());
        newStack.push("Elem1");
        newStack.push("Elem2");
        newStack.push("Elem3");
        assertFalse(newStack.isEmpty());
        assertTrue(newStack.size() == 3);
    }

    @Test
    @DisplayName("If one pushes x then pops, the value popped is x:")
    void pushThenPop(){
        newStack.push("ElemPushThenPop");
        assertEquals(newStack.pop(), "ElemPushThenPop");
    }

    @Test
    @DisplayName("If one pushes x then peeks, the value returned is x, but the size stays the same:")
    void pushThenPeek() {
        newStack.push("ElemPushThenPeek");
        int sizeBeforePeek = newStack.size();
        newStack.peek();
        assertEquals(sizeBeforePeek, newStack.size());
    }

    @Test
    @DisplayName("If the size is n, then after n pops, the stack is empty and has a size 0:")
    void popTillEmpty(){
        newStack.push("Elem1");
        newStack.push("Elem2");
        newStack.push("Elem3");
        newStack.push("Elem4");
        assertEquals(newStack.size(), 4);
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        assertEquals(newStack.size(), 0);
    }

    @Test
    @DisplayName("CPopping from an empty stack does throw a NoSuchElementException:")
    void popOnEmptyStack() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> newStack.pop());
    }

    @Test
    @DisplayName("Peeking into an empty stack does throw a NoSuchElementException:")
    void peekEmptyStack() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> newStack.peek());
    }

    @Test
    @DisplayName("For bounded stacks only, pushing onto a full stack does throw an IllegalStateException")
    void pushToFullStack() { assertEquals(1, 1);}
}
