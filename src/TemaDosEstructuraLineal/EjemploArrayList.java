
package TemaDosEstructuraLineal;

import java.util.ArrayList;


public class EjemploArrayList {

    public static void main(String[] args) {
        // Crear una lista de cadenas
        ArrayList<String> frutas = new ArrayList<>();

        // Añadir elementos a la lista
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Naranja");

        // Imprimir la lista
        System.out.println("Lista de frutas: " + frutas);

        // Acceder a un elemento
        String fruta = frutas.get(1); // Plátano
        System.out.println("Fruta en la posicion 1: " + fruta);

        // Eliminar un elemento
        frutas.remove("Naranja");
        System.out.println("Lista de frutas despues de eliminar Naranja: " + frutas);

        // Tamaño de la lista
        System.out.println("Tamano de la lista: " + frutas.size());
    }
}
