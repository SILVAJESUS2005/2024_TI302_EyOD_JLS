/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnidadDos;

/**
 *
 * @author Jesus
 */
//Interfaz: son los metdos que trae o va a traer nuestra clase pero que no esten implementados
public class LinkedQueue<E> implements Queue<E> {

    private SinglyLinkedList1<E> list = new SinglyLinkedList1<>(); // an empty list

    public LinkedQueue() {
    }

    public int size() {
        return list.size();
    }
    // new queue relies on the initially empty list

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E element) {
        list.addLast(element);
    }

    public E first() {
        return list.first();
    }

    public E dequeue() {
        return list.removeFirst();
    }

}
