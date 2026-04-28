package redDeGimnasios;

public abstract class Entrenamiento {

	private String nombreSocio;
	private double cuotaBase;
	
	public Entrenamiento(String nombreSocio, double cuotaBase) {
		this.nombreSocio = nombreSocio;
		this.cuotaBase = cuotaBase;
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	public double getCuotaBase() {
		return cuotaBase;
	}
	
	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Entrenamiento [nombreSocio=" + nombreSocio + ", cuotaBase=" + cuotaBase + "]";
	}
	
}
