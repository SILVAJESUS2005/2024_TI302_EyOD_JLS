
package TemaTresEstructurasNoLineal.Recursividad;

import java.util.Arrays;


public class ReversoArreglo {
  public static void reverseArray(int[] data, int low, int high) {
      if (low < high) {
          int temp = data[low];
          data[low] = data[high];
          data[high] = temp;
          reverseArray(data, low + 1, high - 1);
      }
  }  
    public static void main(String[] args) {
        int datas [] = {88, 77, 66, 55, 44, 33, 22, 11};
        ReversoArreglo.reverseArray(datas, 3, 5);
        System.out.println(Arrays.toString(datas));
    }
}
