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

	public void setSalidaHumos(boolean salidaHumos) {
		this.salidaHumos = salidaHumos;
	}

	@Override
	public String toString() {
		return "Local [" + super.toString() + "salidaHumos=" + salidaHumos + "]";
	}

	


	
	
	
}
