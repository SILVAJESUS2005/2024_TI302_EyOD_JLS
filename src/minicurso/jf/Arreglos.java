/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Estructura y organización de datos
* TI302 JLS
* 03 DE SEPTIEMBRE DEL 2024
* Fundamentos de java: Practica de arreglos
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package minicurso.jf;

public class Arreglos {

    private int arr[] = new int[10];

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    public int[] Fill0to9() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public int[] clean() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public int[] UnosVer1() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public int[] UnosVer0() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public int[] Fill9to0() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i - 1;
        }
        return arr;
    }

    public int[] ShiftRight() {
        int aux = arr[arr.length - 1]; 
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; 
        }
        arr[0] = aux; 
        return arr;
    }

    public int[] ShiftLeft() {
        int aux = arr[0]; 
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[arr.length - 1] = aux; 
        return arr;
    }
}



