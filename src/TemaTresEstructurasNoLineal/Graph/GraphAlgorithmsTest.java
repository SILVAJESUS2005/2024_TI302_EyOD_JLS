package TemaTresEstructurasNoLineal.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import net.datastructures.*;

public class GraphAlgorithmsTest {

    public static void main(String[] args) {
        // Crear el grafo
        Graph<String, String> g = new AdjacencyMapGraph<>(false); // Ejemplo de implementación de Graph

        Vertex<String> u1 = g.insertVertex("A");
        Vertex<String> u2 = g.insertVertex("B");
        Vertex<String> u3 = g.insertVertex("C");
        Vertex<String> u4 = g.insertVertex("D");

        // Crear aristas
        g.insertEdge(u1, u2, "AB");
        g.insertEdge(u1, u3, "AC");
        g.insertEdge(u2, u4, "BD");

        // Crear estructuras vacías para known y forest
        Set<Vertex<String>> known = new HashSet<>();
        Map<Vertex<String>, Edge<String>> forest = new ProbeHashMap<>();

       GraphAlgorithms.DFS(g, u1, known, forest);
        System.out.println(g);
        
        
    }
}
