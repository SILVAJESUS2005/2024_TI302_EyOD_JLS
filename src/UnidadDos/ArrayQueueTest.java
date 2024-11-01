package UnidadDos;

public class ArrayQueueTest {

    public static void main(String[] args) {
//        //R-6.9
//        Queue<Integer> Q = new ArrayQueue<>();
//        
//        Q.enqueue(5);
//        Q.enqueue(3);
//        System.out.println(Q.dequeue());
//        Q.enqueue(2);
//        Q.enqueue(8);
//        System.out.println(Q.dequeue());
//        System.out.println(Q.dequeue());
//        Q.enqueue(9);
//        Q.enqueue(1);
//        System.out.println(Q.dequeue());
//        Q.enqueue(7);
//        Q.enqueue(6);
//        System.out.println(Q.dequeue());
//        System.out.println(Q.dequeue());
//        Q.enqueue(4);
//        System.out.println(Q.dequeue());
//        System.out.println(Q.dequeue());
//        //FINISH 6.9
//        R-6.7 
//        CREATE QUEUE VACIA
        Queue<Integer> Q = new ArrayQueue<>();
        //15 enqueue
        for (int i = 0; i < 15; i++) {
            Q.enqueue(i + 1);
        }
        System.out.println("TAMAÑO DE Q: " + Q.size());
        //15 dequeue
        for (int i = 0; i < 15; i++) {
            Q.dequeue();
        }
        System.out.println("TAMAÑO DE Q: " + Q.size());
        //5 first
        for (int i = 0; i < 5; i++) {
            System.out.println(Q.first());
        }
        System.out.println("TAMAÑO DE Q: " + Q.size());
        //17 enqueue
        for (int i = 0; i < 17; i++) {
            Q.enqueue(i + 1);
        }
        System.out.println("TAMAÑO DE Q: " + Q.size());
        

        //FINISH 6.7
//        Q.enqueue(3);
//        Q.enqueue(5);
//        System.out.println(Q.size());
//        System.out.println(Q.dequeue());
//        System.out.println(Q.isEmpty());
//        System.out.println(Q.dequeue());
//        Q.enqueue(7);
//        Q.enqueue(9);
//        System.out.println(Q.first());
//        Q.enqueue(4);
    }
}
