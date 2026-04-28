package streamMaster;

public class PlanPremium extends Suscripcion{

	private boolean calidad4k;

	public PlanPremium(String email, double cuotaBase, boolean calidad4k) {
		super(email, cuotaBase);
		this.calidad4k=calidad4k;
	}

	@Override
	public double calcularPrecioFinal() {
		return this.cuotaBase + 5;
	}
	
}
