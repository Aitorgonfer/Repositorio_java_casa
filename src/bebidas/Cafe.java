package bebidas;

public final class Cafe extends Bebida{

	private int numComplementos;
	
	public Cafe(String nombre, double precioBase, int numCompletmentos) {
		super(nombre, precioBase);
		this.numComplementos=numComplementos;
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase() + (numComplementos * 0.50);
	}

}
