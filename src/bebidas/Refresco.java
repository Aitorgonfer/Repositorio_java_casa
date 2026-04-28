package bebidas;

public final class Refresco extends Bebida {

	private String tamaño;
	
	public Refresco(String nombre, double precioBase, String tamaño) {
		super(nombre, precioBase);
		this.tamaño=tamaño;
	}

	
	@Override
	public double calcularPrecio() {
		if(tamaño.equals("G")) {
			return getPrecioBase() * 2;
		}if(tamaño.equals("M")) {
			return getPrecioBase() * 1.5;
		}else {
			return getPrecioBase();
		}
	}
	
}
