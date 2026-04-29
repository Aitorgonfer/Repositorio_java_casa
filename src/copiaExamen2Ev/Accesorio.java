package copiaExamen2Ev;

public class Accesorio {

	private String nombre;
	private double precio;
	
	public Accesorio(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Accesorio [nombre=" + nombre + ", precio=" + precio + "€]";
	}
	
	
	
}
