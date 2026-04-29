package pruebaDeExamen2ev;

public class Local extends Inmueble{

	private boolean salidaHumos;

	public Local(int identificador, String direccion, double precioVenta, int metrosCuadrados, boolean salidaHumos) {
		super(identificador, direccion, precioVenta, metrosCuadrados);
		this.salidaHumos = salidaHumos;
	}

	public boolean isSalidaHumos() {
		return salidaHumos;
	}

	@Override
	public String toString() {
	    return "Local [id=" + getIdentificador() + ", dir=" + getDireccion() 
	            + ", precio=" + getPrecioVenta() + "€, m²=" + getMetrosCuadrados() 
	            + ", salidaHumos=" + salidaHumos + "]";
	}

}
