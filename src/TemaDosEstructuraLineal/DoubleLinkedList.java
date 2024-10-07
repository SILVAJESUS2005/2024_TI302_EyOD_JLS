/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: DoubleLinkedList
* 03 DE OCTUBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaDosEstructuraLineal;

public class DoubleLinkedList<E> {

    private Node<E> trailer;
    private Node<E> header;
    private int size;

    private static class Node<E> {

        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

    }

    public DoubleLinkedList() {

        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement();
    }

    private void addBetween(E e, Node<E> predecessor, Node<E> sucessor) {
        Node<E> newest = new Node<>(e, predecessor, sucessor);
        predecessor.setNext(newest);
        sucessor.setPrev(newest);
        size++;

    }

    public void addFirst(E e) {
        addBetween(e, header, header.getNext());

    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    public E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> sucessor = node.getNext();

        node.setNext(null);
        node.setPrev(null);

        predecessor.setNext(sucessor);
        sucessor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        return remove(trailer.getPrev());
    }
}
