
package TemaTresEstructurasNoLineal.Recursividad;

public class SumaLineal {
    public static int linearSum(int [] data, int n) {
        if(n == 0)
            return 0;
        else
            return linearSum(data, n-1) + data[n-1];
    }
    
    public static void main(String[] args) {
        int datas [] = {};
        System.out.println(SumaLineal.linearSum(datas, 0));
    }
}
