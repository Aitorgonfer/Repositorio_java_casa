package redDeGimnasios;

public final class PlanPremium extends Entrenamiento {

	private double plusSpa;

	public PlanPremium(String nombreSocio, double cuotaBase, double plusSpa) {
		super(nombreSocio, cuotaBase);
		this.plusSpa=plusSpa;
	}

	@Override
	public double calcularPrecio() {
		return getCuotaBase() + plusSpa;
	}

	// Opcional: Getter para plusSpa por si quisiéramos consultarlo fuera
	public double getPlusSpa() {
		return plusSpa;

	}
}