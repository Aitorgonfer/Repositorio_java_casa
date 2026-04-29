package pruebaDeExamen2ev;

public abstract class Inmueble {

	private int identificador;
	private String direccion;
	private double precioVenta;
	private int metrosCuadrados;
	
	public Inmueble(int identificador, String direccion, double precioVenta, int metrosCuadrados) {
		this.identificador = identificador;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return this.identificador == other.identificador;
	}
	
}
