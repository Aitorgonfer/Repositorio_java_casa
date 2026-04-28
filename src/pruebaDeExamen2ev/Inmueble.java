package pruebaDeExamen2ev;

import java.util.Objects;

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

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + identificador + ", dir=" + direccion + ", precio=" + precioVenta
				+ ", m²=" + metrosCuadrados + "]";
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
		return identificador == other.identificador;
	}


	
	
	
}
