
package UnidadDos;

import java.util.Deque;
import java.util.LinkedList;

public class StackAdapter<E> {

    private Deque<E> deque;

    public StackAdapter() {
        deque = new LinkedList<>();  // You can use any deque implementation
    }

    // Push operation (equivalent to adding at the end of deque)
    public void push(E element) {
        deque.addLast(element);
    }

    // Pop operation (equivalent to removing from the end of deque)
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.removeLast();
    }

    // Top operation (peek at the last element of the deque)
    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return deque.peekLast();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return deque.size();
    }
}
