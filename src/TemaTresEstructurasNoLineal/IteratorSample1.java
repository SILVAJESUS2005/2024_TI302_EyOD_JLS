package TemaTresEstructurasNoLineal;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample1 {

    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>(); // populate with random numbers (not shown)
        data.add(0.5);
        data.add(1.25);
        data.add(1.5);
        data.add(2.3);
        data.add(-2.3);
        System.out.println(data);
        Iterator<Double> walk = data.iterator();
        while (walk.hasNext()) {
            if (walk.next() < 0.0) {
                walk.remove();
            }
        }
        System.out.println(data);

    }
}
