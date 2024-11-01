package UnidadDos;

public class CompraVentaTest {

    public static void main(String[] args) {
        CompraVenta cv = new CompraVenta();
        cv.comprar(100, 20);
        cv.comprar(20, 24);
        cv.comprar(200, 36);

        cv.vender(150, 30);

        System.out.println("GANANCIAS TOTALES: " + cv.getGananciaTotal());
    }
}
