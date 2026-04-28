package bebidas;

public abstract class Bebida {
 
	private String nombre;
	private double precioBase;
	public Bebida(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}
	
	
}
