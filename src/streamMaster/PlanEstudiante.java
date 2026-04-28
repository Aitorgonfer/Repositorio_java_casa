package streamMaster;

public class PlanEstudiante extends Suscripcion{

	private String universidad;
	
	public PlanEstudiante(String email, double cuotaBase, String universidad) {
		super(email, cuotaBase);
		this.universidad=universidad;
	}

	@Override
	public double calcularPrecioFinal() {
		return this.cuotaBase * (0.50);
	}
}
