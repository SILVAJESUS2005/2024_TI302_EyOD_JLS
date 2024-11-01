
package UnidadDos;

import java.util.Deque;
import java.util.LinkedList;

public class QueueAdapter<E> {
    private Deque<E> deque;

    public QueueAdapter() {
        deque = new LinkedList<>();  // Puedes usar cualquier implementación de Deque
    }

    // Método para encolar (agregar al final de la cola)
    public void enqueue(E element) {
        deque.addLast(element);
    }

    // Método para desencolar (quitar del inicio de la cola)
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.removeFirst();
    }

    // Método para obtener el elemento al frente de la cola sin eliminarlo
    public E front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return deque.peekFirst();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return deque.size();
    }
}

