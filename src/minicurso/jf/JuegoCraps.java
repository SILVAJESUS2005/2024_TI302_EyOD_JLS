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
package minicurso.jf;

import java.util.Random;

import java.util.Random;

public class JuegoCraps {
    public static void main(String[] args) {
        Random random = new Random();
        int totalJuegos = 1000000;

        // Contadores para las preguntas a) y b)
        int[] juegosGanadosEnTiro = new int[21];  // Índice 0 para el primer tiro, índice 1 para el segundo, etc.
        int[] juegosPerdidosEnTiro = new int[21];
        int juegosGanadosDespuesDel20 = 0;
        int juegosPerdidosDespuesDel20 = 0;

        int totalJuegosGanados = 0;
        int totalJuegosPerdidos = 0;
        long totalTiros = 0;  // Para calcular la duración promedio del juego

        // Ejecutar 1,000,000 de juegos
        for (int i = 0; i < totalJuegos; i++) {
            boolean gane = false;
            int dado1, dado2, suma, puntos;
            int tirosEnEsteJuego = 1;  // Contar el número de tiros en cada juego

            // Lanzamiento inicial
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            suma = dado1 + dado2;

            // Verificar resultado del primer lanzamiento
            if (suma == 7 || suma == 11) {
                gane = true;  // Ganó en el primer tiro
                juegosGanadosEnTiro[0]++;
            } else if (suma == 2 || suma == 3 || suma == 12) {
                gane = false;  // Perdió en el primer tiro
                juegosPerdidosEnTiro[0]++;
            } else {
                puntos = suma;  // Establecer puntos
                // Seguir lanzando hasta ganar o perder
                do {
                    tirosEnEsteJuego++;
                    dado1 = random.nextInt(6) + 1;
                    dado2 = random.nextInt(6) + 1;
                    suma = dado1 + dado2;

                    if (suma == puntos) {
                        gane = true;  // Ganó al igualar los puntos
                        if (tirosEnEsteJuego <= 20) {
                            juegosGanadosEnTiro[tirosEnEsteJuego - 1]++;
                        } else {
                            juegosGanadosDespuesDel20++;
                        }
                        break;
                    } else if (suma == 7) {
                        gane = false;  // Perdió al sacar un 7
                        if (tirosEnEsteJuego <= 20) {
                            juegosPerdidosEnTiro[tirosEnEsteJuego - 1]++;
                        } else {
                            juegosPerdidosDespuesDel20++;
                        }
                        break;
                    }
                } while (true);
            }

            // Contabilizar el resultado del juego
            if (gane) {
                totalJuegosGanados++;
            } else {
                totalJuegosPerdidos++;
            }

            totalTiros += tirosEnEsteJuego;  // Sumar el número de tiros del juego actual
        }

        // Calcular estadísticas
        double probabilidadGanar = (double) totalJuegosGanados / totalJuegos * 100;
        double duracionPromedio = (double) totalTiros / totalJuegos;

        // Imprimir resultados
        System.out.println("Resultados de 1,000,000 juegos de Craps:");
        System.out.println("\nA) Juegos ganados por numero de tiro:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Tiro " + (i + 1) + ": " + juegosGanadosEnTiro[i] + " juegos ganados.");
        }
        System.out.println("Despues del tiro 20: " + juegosGanadosDespuesDel20 + " juegos ganados.");

        System.out.println("\nB) Juegos perdidos por numero de tiro:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Tiro " + (i + 1) + ": " + juegosPerdidosEnTiro[i] + " juegos perdidos.");
        }
        System.out.println("Despues del tiro 20: " + juegosPerdidosDespuesDel20 + " juegos perdidos.");

        System.out.println("\nC) Probabilidad de ganar en Craps: " + probabilidadGanar + "%");

        System.out.println("\nD) Duración promedio de un juego de Craps: " + duracionPromedio + " tiros.");

        System.out.println("\nE) ¿Las probabilidades de ganar mejoran con la duración del juego?");
        System.out.println("No, la probabilidad de ganar no mejora con la duración del juego.");
    }
}

