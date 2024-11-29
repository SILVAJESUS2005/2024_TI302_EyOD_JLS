package TemaTresEstructurasNoLineal;

import java.util.ArrayList;
import java.util.List;

public class PuzzleSolve<E> {

    static int count = 0;

    public static void solve(int k, List<Character> s, List<Character> u) {

        // PARA CADA ELEMENTO e EN u HACER 
        int sizeu = u.size();
        for (int i = 0; i < sizeu; i++) {
            // Add e to the end of S
            s.add(s.size(), u.get(i));
            // Remove e fromU
            u.remove(i);
            if (k == 1) {
                printList("s: " , s);
                count++;
            } else {
                solve(k - 1, s, u);
            }
            Character c = s.get(s.size() - 1);
            // Remove e from the end of S
            s.remove(s.size() - 1);
            // Add e back toU
            u.add(i, c);
        }
    }
    
    public static void printList(String msg, List<Character> s) {
        System.out.print(msg);
        for (int i = 0; i < s.size(); i++) 
            System.out.print(s.get(i) + " ");
        System.out.println("");
        
    }

    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList();
        ArrayList<Character> u = new ArrayList();

        u.add('a');
        u.add('b');
        u.add('c');

        System.out.println("RESULTADOS");
        solve(3,  (List<Character>) s, (List<Character>) u);
        System.out.println("count: " + count);
    }

}
