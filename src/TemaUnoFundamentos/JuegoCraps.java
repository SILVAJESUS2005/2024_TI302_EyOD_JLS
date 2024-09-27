
/* ITESS-TICS-2024.
* AGOSTO-DICIEMBRE 2024.
* Matematicas para la toma de decisiones.
* Descripción: Metodo simplex(prueba del cociente y renglón pivote).
* TI302 JLS.
* 19 DE SEPTIEMBRE DEL 2024.
* By Jesús López Silva.
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente.
 */
package TemaUnoFundamentos;

public class JuegoCraps {

    public static void main(String[] args) {
        boolean gane = false;
        int contador = 0;
        int dado1, dado2, suma, puntos;

        dado1 = (int) (Math.random() * 6 + 1);
        dado2 = (int) (Math.random() * 6 + 1);
        suma = dado1 + dado2;
        contador++;
        
        System.out.println("DADO 1: " + dado1 + " | DADO 2: " + dado2 + " | SUMA: " + suma);

        if (suma == 7 || suma == 11) {
            gane = true;
            System.out.println("Ganaste al primer lanzamiento");
        } else if (suma == 2 || suma == 3 || suma == 12) {
            gane = false;
            System.out.println("Perdiste en el primer lanzamiento.");
        } else {
            puntos = suma;
            System.out.println("Sus puntos son: " + puntos);
            do {
                dado1 = (int) (Math.random() * 6 + 1);
                dado2 = (int) (Math.random() * 6 + 1);
                suma = dado1 + dado2;
                contador++;

                System.out.println("DADO 1: " + dado1 + " | DADO 2: " + dado2 + " | SUMA: " + suma);

                if (suma == puntos) {
                    gane = true;
                    System.out.println("Ganaste igualaste los puntos");
                    break;
                } else if (suma == 7) {
                    gane = false;
                    System.out.println("Perdiste al sacar un 7");
                    break;
                }
            } while (true);
        }

        if (gane) {
            System.out.println("Ganaste en "+contador+ " lanzamientos");
        } else {
            System.out.println("Perdiste en "+contador+ " lanzamientos");
        }
        
    }
}
