package TemaTresEstructurasNoLineal.P4P5;


import java.util.Arrays;
import java.util.Comparator;

public class QuickSortTest {
    public static void main(String[] args) {
        int[] primitiveInts = {12, 232, 24435, 2234435, 9234234, 1234430, 123531, 235233, 74334, 56321};

        // using lambdas & streams
        Integer[] someInts = Arrays.stream(primitiveInts)
                              .boxed()
                              .toArray(Integer[]::new);
        // print unordered data
        System.out.println("unordered data-------------------");
        for (int i = 0; i < someInts.length; i++)
            System.out.print(someInts[i] + " ");
        System.out.println("");
        
        // oreder uisng QuickSort.quickSortInPlace
//        QuickSort.quickSortInPlace(someInts, new CompatorInteger());
        MergeSort.mergeSort(someInts, new CompatorInteger());
        // print ordered data
        System.out.println("unordered data-------------------");
        for (int i = 0; i < someInts.length; i++)
            System.out.print(someInts[i]+" ");
        System.out.println("");
    }
}

class CompatorInteger implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        // positive if a > b
        // zero if a == b
        // negatibe if a - b
        return a - b;
    }
}
