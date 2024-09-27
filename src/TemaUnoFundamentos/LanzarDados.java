
package TemaUnoFundamentos;



import java.util.Random;

public class LanzarDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frecuencia = new int[13];  
        int lanzamientos = 36000000;    

      
        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = random.nextInt(6) + 1;  
            int dado2 = random.nextInt(6) + 1;
            int suma = dado1 + dado2;
            frecuencia[suma]++;  
        }

        System.out.println("Suma   Frecuencia");
        for (int i = 2; i <= 12; i++) { 
            System.out.println(i + "      " + frecuencia[i]);
        }
    }
}


