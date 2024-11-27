
package TemaTresEstructurasNoLineal.Recursividad;

import java.util.Arrays;


public class SumaBinaria {
    public static int binarySum(int[] data, int low, int high) {
        if(low > high)
            return 0;
        else if (low == high)
            return data[low];
        else {
            int mid = (low + high) / 2;
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high); 
        }
    }
    
    public static void main(String[] args) {
        int datas [] = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(SumaBinaria.binarySum(datas, 2, 6));
    }
}
