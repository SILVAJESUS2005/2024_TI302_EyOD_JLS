package TemaTresEstructurasNoLineal;

public class Algo {

    public static int fibo [] = new int [100];
 
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static int fibonacci2(int n) {
        if (n == 0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        fibo[0]=0;
        fibo[1]=1;
        for (int i = 2; i <= n; i++) {
          fibo[i] = fibo[i-1]+fibo[i-2];  
        }

        return fibo[n];
    
    }

}
