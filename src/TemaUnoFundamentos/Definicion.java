/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Tarea Definicion
* 19 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaUnoFundamentos;

public class Definicion {

    public static void main(String[] args) {
        
        int[] mejoresPuntuaciones = {90, 85, 92, 78, 88};  
        for (int i = 0; i < mejoresPuntuaciones.length; i++) {
            System.out.printf("%d\t", mejoresPuntuaciones[i]);  
        }
        System.out.println(); 

//        int[] bono = new int[15];  
//        for (int i = 0; i < bono.length; i++) {
//            bono[i] += 1;  
//        }
//        int[] cuentas = new int[10];  
//        for (int i = 0; i < cuentas.length; i++) {
//            cuentas[i] = 0;  
//        }
//        int[][] t = new int[2][3];
//
//        System.out.print("     ");  
//        for (int j = 0; j < t[0].length; j++) {
//            System.out.printf("%4d", j);  
//        }
//        System.out.println();
//        for (int i = 0; i < t.length; i++) {
//            System.out.printf("%4d", i);  
//            for (int j = 0; j < t[i].length; j++) {
//                System.out.printf("%4d", t[i][j]);  
//            }
//            System.out.println();
//        }
//        int total = t[0][2] + t[1][2];  
//        System.out.println("El total de la tercera columsa es: " + total);
//        for (int j = 0; j < t[0].length; j++) {
//            System.out.printf("%d ", t[0][j]);
//        }
//        System.out.println();  
//        int menor = t[0][0];
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                if (t[i][j] < menor) {
//                    menor = t[i][j];  
//                }
//            }
//        }
//        System.out.println("El menos es: " + menor);
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                System.out.println("Introduce el valor para t[" + i + "][" + j + "]: ");
//                t[i][j] = sc.nextInt();  
//            }
//        }
//        t[0][0] = 0;
//        t[0][1] = 0;
//        t[0][2] = 0;
//        t[1][0] = 0;
//        t[1][1] = 0;
//        t[1][2] = 0;
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                t[i][j] = 0;
//            }
//        }
//        t[0][1] = 0;
//        for (int i = 0; i < t.length; i++) {
//            System.out.println(t[i][1]);
//        }
//        for (int j = 0; j < t[0].length; j++) {
//            System.out.println(t[0][j]);
//        }
    }
}

//A)
//        int p[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(p[5]);
//B)
//        int g[] = new int[5];
//        for (int i = 0; i < g.length; i++) {
//            g[i] = 8;
//            System.out.print(g[i] + " ");
//
//        }
//C)
//        float c[] = new float[100];
//        float sum = 0;
//        for (int i = 0; i < c.length; i++) {
//            sum += c[i];
//        }
//        System.out.println(sum);
//D)
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//        int[] b = new int[34];
//
//        int inicioporcion = 10;
//
//        for (int i = 0; i < a.length; i++) {
//            b[inicioporcion + i] = a[i];
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
//E)
//        float[] w = new float[99];
//        Random random = new Random();
//
//        for (int i = 0; i < w.length; i++) {
//            w[i] = random.nextFloat() * 100;
//        }
//
//        float min = w[0];
//        float max = w[0];
//
//        for (int i = 1; i < w.length; i++) {
//            if (w[i] < min) {
//                min = w[i];
//            }
//            if (w[i] > max) {
//                max = w[i];
//            }
//        }
//        System.out.println("El valor minimo es: " + min);
//        System.out.println("El valor maximo es: " + max);
