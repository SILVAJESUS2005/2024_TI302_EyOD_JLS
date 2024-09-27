/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Estructura y organización de datos
* TI302 JLS
* 02 DE SEPTIEMBRE DEL 2024
* Fundamentos de java: Estrcutura de una clase
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package minicurso.jf;

public class UnaClase {

    private int entero;
    private float grande;
    private double decimal;

    public UnaClase(int entero, float grande, double decimal) {
        this.entero = entero;
        this.grande = grande;
        this.decimal = decimal;
    }

    public UnaClase() {
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public float getGrande() {
        return grande;
    }

    public void setGrande(float grande) {
        this.grande = grande;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return "UnaClase{" + "entero=" + entero + ", grande=" + grande + ", decimal=" + decimal + '}';
    }
    
    
  
public class OtraClase{
    
}    
}

