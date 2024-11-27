
package TemaTresEstructurasNoLineal.Recursividad;

public class Potencias {
    
    //Algoritmo BAD
    public static double powerBad(double x, int n){
        if(n == 0)
            return 1;
        else
            return x * powerBad(x, n-1);
    }
    
    // Algoritmo GOOD
    public static double powerGood(double x, int n){
        if (n == 0)
            return 1;
        else{
            double partial = powerGood(x,n/2);
            double result = partial * partial;
            if(n % 2 == 1)
                result *= x;
            return result;
        } 
        
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("RESULTADO: ");     
        System.out.println(Potencias.powerGood(4, 10000));
        long endTime = System.nanoTime();
        
        System.out.println("TIEMPO REALIZADO: ");     
        System.out.println((endTime - startTime) / 1e9);
           
    }
}
