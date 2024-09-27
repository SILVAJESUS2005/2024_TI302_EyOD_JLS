/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaUnoFundamentos;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class NumerosDuplicados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosUnicos = new int[5];  
        int contador = 0;  
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero entre 10 y 100: ");
            int numero = sc.nextInt();
           
            if (numero >= 10 && numero <= 100) {
                boolean duplicado = false;   
             
                for (int j = 0; j < contador; j++) {
                    if (numerosUnicos[j] == numero) {
                        duplicado = true;
                        break;
                    }
                }
    
                if (!duplicado) {
                    numerosUnicos[contador] = numero;
                    contador++;
                }
            } else {
                System.out.println("Numero fuera del rango permitido.");
            }
            
            System.out.print("Numeros unicos introducidos: ");
            for (int j = 0; j < contador; j++) {
                System.out.print(numerosUnicos[j] + " ");
            }
            System.out.println();
        }
    }
}


