/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemaTresEstructurasNoLineal;

/**
 *
 * @author Jesus
 */

    import java.util.ArrayList;
import java.util.List;

public class PuzzleSolver2 {

    // Método principal que inicializa los valores
    public static void main(String[] args) {
        List<Character> U = new ArrayList<>();
        U.add('a');
        U.add('b');
        U.add('c');
        int k = 3;

        List<List<Character>> results = new ArrayList<>();
        PuzzleSolve(k, new ArrayList<>(), U, results);

        // Imprimir resultados
        for (List<Character> solution : results) {
            System.out.println(solution);
        }
    }

    // Método recursivo que genera las combinaciones
    public static void PuzzleSolve(int k, List<Character> S, List<Character> U, List<List<Character>> results) {
        if (k == 0) {
            // Si se llega a una solución, agregarla a la lista de resultados
            results.add(new ArrayList<>(S));
            return;
        }

        // Iterar sobre los elementos de U
        for (int i = 0; i < U.size(); i++) {
            char e = U.get(i);

            // Agregar e a la secuencia S
            S.add(e);
            U.remove(i);

            // Llamada recursiva con k reducido
            PuzzleSolve(k - 1, S, U, results);

            // Deshacer cambios (backtracking)
            S.remove(S.size() - 1);
            U.add(i, e);
        }
    }
}


