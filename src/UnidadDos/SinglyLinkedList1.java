/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: SinglyLinkedList
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package UnidadDos;

import TemaDosEstructuraLineal.*;

public class SinglyLinkedList1<E>  {

    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList1() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.element;
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.element;
    }

    public void addFirst(E e) {

        head = new Node(e, head);
        if (size == 0) {

            tail = head;
        }
        size++;
//        Node <E> newest = new Node<E>(e,null);
//        newest.next = head;
//        head = newest;
//        size = size+1;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;

    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }
}
