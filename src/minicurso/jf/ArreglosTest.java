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

public class ArreglosTest {
    public static void main(String[] args) {
        Arreglos a = new Arreglos();
        
        a.Fill0to9();
        System.out.println("Fill0to9: " + a); 

        a.UnosVer1();
        System.out.println("UnosVer1: " + a); 

        a.UnosVer0();
        System.out.println("UnosVer0: " + a); 
        
        a.Fill9to0();
        System.out.println("Fill9to0: " + a);  

        a.ShiftRight();
        System.out.println("ShiftRight: " + a);

        a.ShiftLeft();
        System.out.println("ShiftLeft: " + a); 
    }
}

