/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: ArrayStackTest
* 21 DE OCTUBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package UnidadDos;

import java.util.Stack;

public class ArrayStackTest {

    public static <E> void transfer(Stacks<E> S, Stacks<E> T) {

        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }

    public static <E> void mydelete(Stacks<E> S) {
        if (S.isEmpty()) {
            return;
        }
        System.out.println(S.pop());
        mydelete(S);
    }

    public static void main(String[] args) {
        //6.4
//        Stacks<String> S = new ArrayStack<>();

//        Stacks<String> T = new ArrayStack<>();
//
//        S.push("A");
//        S.push("B");
//        S.push("C");
//        System.out.println("CAMBIOS ANTES DEL TRANSFER");
//        System.out.println("Size T: " + T.size());
//        System.out.println("SIZE S: " + S.size());
//        transfer(S, T);
//        System.out.println("CAMBIOS DESPUES DEL TRANSFER");
//        System.out.println("Size T: " + T.size());
//        System.out.println("SIZE S: " + S.size());
//        FINISH 6.4
        //6.5
        Stacks<String> S = new ArrayStack<>();

        S.push("A");
        S.push("B");
        S.push("C");
        System.out.println("Size antes del delete");
        System.out.println(S.size());
        mydelete(S);
        System.out.println("Size despues del delete");
        System.out.println(S.size());
        //FINISH 6.5

//        //6.3
//        S.push(5);
//        S.push(3);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        S.push(2);
//        S.push(8);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        System.out.println(S.pop());
//        S.push(9);
//        S.push(1);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        S.push(7);
//        S.push(6);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        System.out.println(S.pop());
//        S.push(4);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        System.out.println(S.pop());
//       
//        // PUSH 25
//        for (int i = 0; i < 25; i++) {  // Cambié a 25 para agregar 25 elementos en total
//            S.push(i + 1);
//        }
//        System.out.println("Tamaño de la pila despues del PUSH: " + S.size());
//
//        // POP 7
//        for (int i = 0; i < 7; i++) {
//            System.out.println("Elemento POP: " + S.pop());
//        }
//        System.out.println("Tamaño de la pila despues del POP: " + S.size());
//
//        // TOP 12
//        for (int i = 0; i < 12; i++) {
//            System.out.println("Elemento en el TOP: " + S.top());
//        }
//        System.out.println("Tamaño final de la pila: " + S.size());
//        
//        
// FINISH 6.1, 6.2
    }

}
