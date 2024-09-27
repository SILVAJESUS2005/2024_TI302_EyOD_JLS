/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: CircularyLinkedList
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaDosEstructuraLineal;

public class CircularyLinkedList<E> {

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

    private Node<E> tail;
    private int size;

    public CircularyLinkedList() {
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
        return tail.getNext().element;
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.element;
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.next);

            tail.setNext(newest);

        }
        size++;

        //CODIGO NO OPTIMO
        //        Node <E> newest = new Node<E>(e,null);
        //        newest.next = head;
        //        head = newest;
        //        size = size+1;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();

    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.next;

        if (head == tail) {
            tail = null;

        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.element;

    }
    public void rotateTail(){
        if(tail!=null)
            tail = tail.getNext();
    }
}
