/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnidadDos;

/**
 *
 * @author Jesus
 */
public class ArrayQueueTest {
    
    public static void main(String[] args) {
        Queue<Integer> S = new ArrayQueue<>();
        S.enqueue(3);
        S.enqueue(5);
        System.out.println(S.size());
        System.out.println(S.dequeue());
        System.out.println(S.isEmpty());
        System.out.println(S.dequeue());
        S.enqueue(7);
        S.enqueue(9);
        System.out.println(S.first());
        S.enqueue(4);
        
    }
}
