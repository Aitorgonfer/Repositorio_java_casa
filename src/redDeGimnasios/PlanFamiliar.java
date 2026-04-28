package redDeGimnasios;

public final class PlanFamiliar extends Entrenamiento{

	private int numFamiliares;
	private static final double descuento=0.85;
	
	public PlanFamiliar(String nombreSocio, double cuotaBase, int numFamiliares) {
		super(nombreSocio, cuotaBase);
		this.numFamiliares=numFamiliares;
	}

	@Override
	public double calcularPrecio() {
		if(numFamiliares > 3) {
			return getCuotaBase() * descuento;
		}else {
			return getCuotaBase();
		}
	}
	
}
