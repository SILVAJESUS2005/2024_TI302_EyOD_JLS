/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Estructura y organización de datos
* TI302 JLS
* 11 DE SEPTIEMBRE DEL 2024
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package TemaUnoFundamentos;

import java.util.Scanner;


public class AsteriscosPorNumero {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numero = scanner.nextInt();

            while (numero < 1 || numero > 30) {
                System.out.print("Número inválido. Ingrese un número entre 1 y 30: ");
                numero = scanner.nextInt();
            }

            numeros[i] = numero;
        }


        System.out.println("\nBarras de asteriscos:");
        for (int numero : numeros) {
            for (int j = 0; j < numero; j++) {
                System.out.print('*');
            }
            System.out.println();  // Salto de línea después de imprimir los asteriscos
        }

        scanner.close();
    } 
}
