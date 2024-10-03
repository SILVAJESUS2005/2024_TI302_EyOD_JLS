
package TemaDosEstructuraLineal;

public class SlotsGame {

    public static void main(String[] args) {
        CircularyLinkedList<String> cll1 = new CircularyLinkedList<>();
        CircularyLinkedList<String> cll2 = new CircularyLinkedList<>();
        cll1.addFirst("1");
        cll1.addFirst("2");
        cll2.addFirst("1");
        cll2.addFirst("2");
        int nrotaciones = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < nrotaciones; i++) {
            cll1.rotateTail();
        }

        System.out.print(cll1.first());
        nrotaciones = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < nrotaciones; i++) {
            cll2.rotateTail();

        }
        System.out.print(cll2.first());
        if (cll1.first() == "2" && cll2.first() == "2") {
            System.out.print("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
