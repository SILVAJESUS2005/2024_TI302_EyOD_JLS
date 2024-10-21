package UnidadDos;

/**
 *
 * @author Jesus
 */


    public class ArrayStack<E> implements Stacks<E> {

        public static final int CAPACITY = 1000; // default array capacity

        private E[] data;
        private int t = -1;
        // generic array used for storage
        // index of the top element in stack

        public ArrayStack() {
            this(CAPACITY);
        } // constructs stack with default capacity

        public ArrayStack(int capacity) {
            data = (E[]) new Object[capacity];
        }

        public int size() {
            return (t + 1);
        }
        // constructs stack with given capacity
        // safe cast; compiler may give warning

        public boolean isEmpty() {
            return (t == -1);
        }

        public void push(E e) throws IllegalStateException {
            if (size() == data.length) {
                throw new IllegalStateException("Stack is full");
            }
            data[++t] = e;
        }

        public E top() {
            if (isEmpty()) {
                return null;
            }
            return data[t];
        }

        public E pop() {
            if (isEmpty()) {
                return null;
            }
            E answer = data[t];
            data[t] = null;
            t--;
            return answer;
        }
        // increment t before storing new item
        // dereference to help garbage collection
    }
    

