/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Estructura y organizacion de datos.
* Descripción: DoubleLinkedList Test
* 03 DE OCTUBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaDosEstructuraLineal;

public class DoubleLinkedListTest {

    public static void main(String[] args) {
        //Test 1
        test1();
    }
    
    public static void test1() {
        DoubleLinkedList<String> ssl = new DoubleLinkedList<>();

        ssl.addFirst("D");
        ssl.addFirst("C");
        ssl.addFirst("B");
        ssl.addFirst("A");

        System.out.println("Remove" + ssl.removeFirst());
        //System.out.println("Size: " + ssl.size());
        //System.out.println("First:" + ssl.first());
        //System.out.println("Last: " + ssl.last());
        System.out.println("Remove" + ssl.removeFirst());
        //System.out.println("Size: " + ssl.size());
        //System.out.println("First:" + ssl.first());
       //System.out.println("Last: " + ssl.last());
        System.out.println("Remove" + ssl.removeFirst());
        //System.out.println("Size: " + ssl.size());
        //System.out.println("First:" + ssl.first());
        //System.out.println("Last: " + ssl.last());
        System.out.println("Remove" + ssl.removeFirst());
        //System.out.println("Size: " + ssl.size());
        //System.out.println("First:" + ssl.first());
        //System.out.println("Last: " + ssl.last());

    }
}
