/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Estructura y organización de datos
* TI302 JLS
* 11 DE SEPTIEMBRE DEL 2024
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package TemaUnoFundamentos;

public class EDAlgoTP01 {

    public static void problemaE1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print('@');
            }

            System.out.println();

        }

    }

    public static void problemaE2_A() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println("");
        }
        System.out.println("");

    }

    public static void problemaE2_B() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print('*');
            }

            System.out.println("");
        }

    }

    public static void problemaE2_C() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println("");

        }

    }

    public static void problemaE2_D() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 19 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void problemaE5() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 3; j++) {

                for (int k = 1; k <= 4; k++) 
                    System.out.print('*');
                    System.out.println();
                }
                System.out.println();
            }

        }
    }



class SalarioPorComision {

    private int[] ventas;
    private int[] histograma;
    private int[] salario;

    public enum Rango {
        R200_299, R300_399, R400_499, R500_599, R600_699, R700_799, R800_899, R900_999, R1000
    };

    public static final int NUMERO_DE_CASILLAS = 9;

    public SalarioPorComision(int[] ventas) {
        this.ventas = ventas;

        //CREAR ESPACIOS A LOS DATOS
        this.salario = new int[ventas.length];

        this.histograma = new int[NUMERO_DE_CASILLAS];
    }

    public void calcularSalario() {
        for (int i = 0; i < ventas.length; i++) {
            salario[i] = (int) (200 + 0.09 * ventas[i]);
        }
    }

    public void imprimir() {
        for (int i = 0; i < salario.length; i++) {
            System.out.print(salario[i] + " ");
        }
        System.out.println("");
    }

    public static void dibujarRombo() {
        int n = 9; // Para una línea central de 9 asteriscos

        // Parte superior del rombo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
