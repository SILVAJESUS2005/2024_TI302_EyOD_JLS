/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnidadDos;

/**
 *
 * @author Jesus
 */
public class StackAdapterTest {
    public static void main(String[] args) {
        StackAdapter<Integer> stack = new StackAdapter<>();

        // Ejemplo de uso
        System.out.println("Apilando elementos...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento en la cima: " + stack.top()); // Debería mostrar 30
        System.out.println("Size del stack: " + stack.size());   // Debería mostrar 3

        System.out.println("Desapilando elementos...");
        System.out.println(stack.pop()); // Debería mostrar 30
        System.out.println(stack.pop()); // Debería mostrar 20

        System.out.println("Elemento en la cima ahora: " + stack.top()); // Debería mostrar 10
        System.out.println("Size del stack despues de desapilar: " + stack.size()); // Debería mostrar 1

        System.out.println("El stack esta vacio " + stack.isEmpty()); // Debería mostrar false

        System.out.println("Desapilando ultimo elemento...");
        stack.pop(); // Debería vaciar el stack

        System.out.println("El stack esta vacio ahora " + stack.isEmpty()); // Debería mostrar true
    }
}
