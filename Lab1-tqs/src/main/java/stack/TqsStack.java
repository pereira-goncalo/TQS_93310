package stack;

import java.util.ArrayList;

public class TqsStack<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void push(T elem) {
        stack.add(elem);
    }

    public T peek() {
        return stack.get(stack.size()-1);
    }

    public T pop() {
        T elem = stack.get(stack.size() - 1);
        stack.remove(stack.size()-1);
        return elem;
    }
}
