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


public class ArrayStackTest {

    public static void main(String[] args) {
        Stacks<Integer> S = new ArrayStack<>();
        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());

    }
}
