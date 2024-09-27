/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: SinglyLinkedList
* 23 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaDosEstructuraLineal;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList<String> ssl = new SinglyLinkedList<>();
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

        String dato = null;
        while ((dato = ssl.removeFirst()) != null) {
            System.out.print("* " + dato + " *");

        }
        System.out.println("");

    }

}
