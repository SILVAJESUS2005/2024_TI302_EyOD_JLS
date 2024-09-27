/*
* ITESS-TICS-2024
* AGOSTO-DICIEMBRE 2024
* Estructura y organización de datos
* TI302 JLS
* 11 DE SEPTIEMBRE DEL 2024
* By Jesús López Silva
* jesuslopezsilva206@gmail.com
* Teacher Francisco Javier Montecillo Puente
 */
package TemaUnoFundamentos;

public class EDAlgoTP01Test {

    public static void main(String[] args) {
//        EDAlgoTP01.problemaE1();
//        EDAlgoTP01.problemaE2_A();
//        EDAlgoTP01.problemaE2_B();
//        EDAlgoTP01.problemaE2_C();
//        EDAlgoTP01.problemaE2_D();

        salarioPorComisionTest();
//        SalarioPorComision.dibujarRombo();
//        EDAlgoTP01.problemaE5();
    }

    public static void salarioPorComisionTest() {
        int[] ventas = {5000, 230, 430, 590};
        System.out.println("E3: salarioPorComisionTest-----------------------");
        SalarioPorComision spc = new SalarioPorComision(ventas);
        spc.calcularSalario();
        spc.imprimir();
    }
}
