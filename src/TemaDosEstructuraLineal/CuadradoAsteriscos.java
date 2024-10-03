/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaDosEstructuraLineal;

import java.util.Scanner;

public class CuadradoAsteriscos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el valor de n
        System.out.print("Introduce el tamaño del cuadrado (n): ");
        int n = scanner.nextInt();
        
        // Generar el cuadrado de asteriscos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Condición para imprimir asterisco en los bordes
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
    }
}



////P4: Operaciones sobre una lista enlazada inicialmente con los elementos {"1", "2", "3"}.
//a) removeFirst()
//Descripción: Elimina el primer elemento de la lista.
//Proceso:
//La lista inicial es {"1", "2", "3"}.
//Se llama a lista.removeFirst(), que elimina el primer elemento, es decir, "1".
//La lista resultante es {"2", "3"}.
//Salida: Después de removeFirst: [2, 3]
//b) addFirst("4")
//Descripción: Agrega el elemento "4" al principio de la lista.
//Proceso:
//La lista actual es {"2", "3"}.
//Se llama a lista.addFirst("4"), lo que inserta "4" al inicio de la lista.
//La lista resultante es {"4", "2", "3"}.
//Salida: Después de addFirst("4"): [4, 2, 3]
//c) addLast("5")
//Descripción: Agrega el elemento "5" al final de la lista.
//Proceso:
//La lista actual es {"4", "2", "3"}.
//Se llama a lista.addLast("5"), lo que inserta "5" al final.
//La lista resultante es {"4", "2", "3", "5"}.
//Salida: Después de addLast("5"): [4, 2, 3, 5]
//d) removeFirst()
//Descripción: Elimina el primer elemento de la lista.
//Proceso:
//La lista actual es {"4", "2", "3", "5"}.
//Se llama a lista.removeFirst(), que elimina el primer elemento, "4".
//La lista resultante es {"2", "3", "5"}.
//Salida: Después de removeFirst: [2, 3, 5]
//e) removeLast()
//Descripción: Elimina el último elemento de la lista.
//Proceso:
//La lista actual es {"2", "3", "5"}.
//Se llama a lista.removeLast(), que elimina el último elemento, "5".
//La lista resultante es {"2", "3"}.
//Salida: Después de removeLast: [2, 3]
//P5: Generar listas desde una lista vacía.
//a) datos => {"A", "B", "C"}
//Descripción: Queremos construir una lista con los elementos "A", "B" y "C" en ese orden.
//Proceso:
//Creamos una lista vacía.
//Se llama a datos1.addLast("A"), datos1.addLast("B"), y datos1.addLast("C") para agregar los elementos al final.
//La lista resultante es {"A", "B", "C"}.
//Salida: Lista a): [A, B, C]
//b) datos => {"B", "C"}
//Descripción: Queremos construir una lista con los elementos "B" y "C", eliminando "A".
//Proceso:
//Creamos una lista vacía y agregamos "A", "B", "C".
//Se llama a datos2.removeFirst(), que elimina "A".
//La lista resultante es {"B", "C"}.
//Salida: Lista b): [B, C]
//c) datos => {"B"}
//Descripción: Queremos construir una lista con solo el elemento "B".
//Proceso:
//Creamos una lista vacía y agregamos "A", "B", "C".
//Se llama a datos3.removeFirst() para eliminar "A" y luego datos3.removeLast() para eliminar "C".
//La lista resultante es {"B"}.
//Salida: Lista c): [B]
//d) datos => {"B", "A"}
//Descripción: Queremos construir una lista con los elementos "B" y "A" en ese orden.
//Proceso:
//Creamos una lista vacía.
//Se llama a datos4.addFirst("A") para agregar "A" y luego datos4.addFirst("B") para agregar "B" antes que "A".
//La lista resultante es {"B", "A"}.
//Salida: Lista d): [B, A]
//e) datos => {"C", "B", "A"}
//Descripción: Queremos construir una lista con los elementos "C", "B", "A" en ese orden.
//Proceso:
//Creamos una lista vacía.
//Se llama a datos5.addFirst("A"), datos5.addFirst("B") y datos5.addFirst("C"), de modo que los elementos se agregan al inicio, uno tras otro.
//La lista resultante es {"C", "B", "A"}.
//Salida: Lista e): [C, B, A]
