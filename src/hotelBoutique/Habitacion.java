package hotelBoutique;

public abstract class Habitacion {
	
	private int numero;
	private double precioNoche;
	private String descripcion;
	
	public Habitacion(int numero, double precioNoche, String descripcion) {
		this.numero = numero;
		this.precioNoche = precioNoche;
		this.descripcion = descripcion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
