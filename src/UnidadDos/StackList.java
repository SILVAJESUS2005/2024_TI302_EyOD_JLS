/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UnidadDos;

/**
 *
 * @author Jesus
 */
public interface StackList<E> {

    public int size();

    public boolean isEmpty();

    public E first();

    public E last();

    public void addFirst(String e);

    public void addLast(E e);

    public E removeFirst();
}
