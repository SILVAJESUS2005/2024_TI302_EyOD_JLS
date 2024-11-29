
package TemaTresEstructurasNoLineal;

public class AlgoTest {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(Algo.fibonacci2(99));
        long endTime = System.nanoTime();
        
        System.out.println((endTime - startTime) / 1e9);
         
    }
}