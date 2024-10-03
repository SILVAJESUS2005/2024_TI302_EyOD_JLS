/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaDosEstructuraLineal;

import java.util.LinkedList;

public class ListaEnlazadaTest {
    
    public static void main(String[] args) {
        
        // Resolver P4: Secuencia de operaciones con lista enlazada simple.
        LinkedList<String> lista = new LinkedList<>();
        
        // Inicializar la lista con {"1", "2", "3"}
        lista.add("1");
        lista.add("2");
        lista.add("3");
        System.out.println("Inicial: " + lista);

        // a) removeFirst()
        lista.removeFirst();
        System.out.println("Después de removeFirst: " + lista); // {"2", "3"}

        // b) addFirst("4")
        lista.addFirst("4");
        System.out.println("Después de addFirst(\"4\"): " + lista); // {"4", "2", "3"}

        // c) addLast("5")
        lista.addLast("5");
        System.out.println("Después de addLast(\"5\"): " + lista); // {"4", "2", "3", "5"}

        // d) removeFirst()
        lista.removeFirst();
        System.out.println("Después de removeFirst: " + lista); // {"2", "3", "5"}

        // e) removeLast()
        lista.removeLast();
        System.out.println("Después de removeLast: " + lista); // {"2", "3"}

        // Resolver P5: Generar las listas dadas a partir de una lista vacía.

        // a) datos => {"A", "B", "C"}
        LinkedList<String> datos1 = new LinkedList<>();
        datos1.addLast("A");
        datos1.addLast("B");
        datos1.addLast("C");
        System.out.println("\nLista a): " + datos1); // {"A", "B", "C"}

        // b) datos => {"B", "C"}
        LinkedList<String> datos2 = new LinkedList<>();
        datos2.addLast("A");
        datos2.addLast("B");
        datos2.addLast("C");
        datos2.removeFirst();
        System.out.println("Lista b): " + datos2); // {"B", "C"}

        // c) datos => {"B"}
        LinkedList<String> datos3 = new LinkedList<>();
        datos3.addLast("A");
        datos3.addLast("B");
        datos3.addLast("C");
        datos3.removeFirst();
        datos3.removeLast();
        System.out.println("Lista c): " + datos3); // {"B"}

        // d) datos => {"B", "A"}
        LinkedList<String> datos4 = new LinkedList<>();
        datos4.addFirst("A");
        datos4.addFirst("B");
        System.out.println("Lista d): " + datos4); // {"B", "A"}

        // e) datos => {"C", "B", "A"}
        LinkedList<String> datos5 = new LinkedList<>();
        datos5.addFirst("A");
        datos5.addFirst("B");
        datos5.addFirst("C");
        System.out.println("Lista e): " + datos5); // {"C", "B", "A"}
    }
}
