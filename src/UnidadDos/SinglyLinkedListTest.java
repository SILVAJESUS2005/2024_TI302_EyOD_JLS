/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnidadDos;

/**
 *
 * @author Jesus
 */
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        StackList<Integer> ssl = new SinglyLinkedList<>();
        System.out.println("Size: " + ssl.size());
        System.out.println("First:" + ssl.first());
        System.out.println("Last: " + ssl.last());

        ssl.addFirst("Jesus");

        System.out.println("Size: " + ssl.size());
        System.out.println("First:" + ssl.first());
        System.out.println("Last: " + ssl.last());

        ssl.addFirst("Montecillo");

        System.out.println("Size: " + ssl.size());
        System.out.println("First:" + ssl.first());
        System.out.println("Last: " + ssl.last());
        System.out.println("Remove" + ssl.removeFirst());

        System.out.println("Size: " + ssl.size());
        System.out.println("First:" + ssl.first());
        System.out.println("Last: " + ssl.last());

//        String dato = null;
//        while ((dato = ssl.removeFirst()) != null) {
//            System.out.print("* " + dato + " *");
//
//        }
//        System.out.println("");

    }
    }
 

