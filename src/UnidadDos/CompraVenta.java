package UnidadDos;
import java.util.LinkedList;
import java.util.Queue;

public class CompraVenta {
    private Queue<Double> accCompr = new LinkedList<>(); // Cantidad de acciones compradas en orden FIFO
    private Queue<Double> precCompr = new LinkedList<>(); // Precio de las acciones compradas en orden FIFO
    private double gananciaTotal = 0.0; // Ganancia total

    public void comprar(double cantidad, double precio) {
        accCompr.add(cantidad);
        precCompr.add(precio);
    }

    public void vender(double cantidad, double precioVenta) {
        double cantidadRestante = cantidad;

        while (cantidadRestante > 0 && !accCompr.isEmpty()) {
            double cantidadComprada = accCompr.peek();
            double precioCompra = precCompr.peek();

            if (cantidadRestante >= cantidadComprada) {
                gananciaTotal += cantidadComprada * (precioVenta - precioCompra);
                cantidadRestante -= cantidadComprada;

                accCompr.poll();
                precCompr.poll();
            } else {
                gananciaTotal += cantidadRestante * (precioVenta - precioCompra);
                
                accCompr.poll();
                accCompr.add(cantidadComprada - cantidadRestante);
                cantidadRestante = 0;
            }
        }
    }

    public double getGananciaTotal() {
        return gananciaTotal;
    }

}
