package redDeGimnasios;

public final class PlanEstandar extends Entrenamiento{

	
	public PlanEstandar(String nombreSocio, double cuotaBase) {
		super(nombreSocio, cuotaBase);
	}

	@Override
	public double calcularPrecio() {
		return getCuotaBase();
	}

	
}
