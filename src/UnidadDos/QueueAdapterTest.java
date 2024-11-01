
package UnidadDos;

public class QueueAdapterTest {
    public static void main(String[] args) {
        QueueAdapter<Integer> queue = new QueueAdapter<>();

        // Ejemplo de uso
        System.out.println("Encolando elementos...");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Elemento en el frente: " + queue.front()); // Debería mostrar 10
        System.out.println("Size de la cola: " + queue.size());      // Debería mostrar 3

        System.out.println("Desencolando elementos...");
        System.out.println(queue.dequeue()); // Debería mostrar 10
        System.out.println(queue.dequeue()); // Debería mostrar 20

        System.out.println("Elemento en el frente ahora: " + queue.front()); // Debería mostrar 30
        System.out.println("Size de la cola despues de desencolar: " + queue.size()); // Debería mostrar 1

        System.out.println("La cola esta vacia " + queue.isEmpty()); // Debería mostrar false

        System.out.println("Desencolando ultimo elemento...");
        queue.dequeue(); // Debería vaciar la cola

        System.out.println("La cola esta vacia ahora " + queue.isEmpty()); // Debería mostrar true
    }
}

