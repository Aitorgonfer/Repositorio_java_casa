package bebidas;

import java.util.ArrayList;

public class AppBebidas {

	public static void main(String[] args) {
		
		ArrayList<Bebida>listaBebidas = new ArrayList<>();
		
		listaBebidas.add(new Cafe("Expreso", 2, 0));
		listaBebidas.add(new Refresco("Coca-Cola", 2.50, "Grande"));
		listaBebidas.add(new Cafe("Capuccino", 3, 1));
		
		double totalPrecio = 0;
        Bebida bebidaMasCara = listaBebidas.get(0);
		
		for(Bebida b: listaBebidas) {
			System.out.println(b.toString());
		
			double precioFinalBebida = b.calcularPrecio();
            totalPrecio += precioFinalBebida;
            
            if (precioFinalBebida > bebidaMasCara.calcularPrecio()) {
                bebidaMasCara = b;
            }
		}
		
		System.out.println("===============================");
        System.out.println("TOTAL DEL PEDIDO: " + totalPrecio + "€");
        System.out.println("LA BEBIDA MÁS CARA ES: " + bebidaMasCara.getNombre() + 
                           " (" + bebidaMasCara.calcularPrecio() + "€)");
	}
}
