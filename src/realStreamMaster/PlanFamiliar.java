package realStreamMaster;

public class PlanFamiliar extends Suscripcion{

	private static final double PLUS=0.4;
	private int maxPerfiles=5;
	

	public PlanFamiliar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}

	@Override
	protected double calcularPrecio() {
		return getPrecioBase() * (1+PLUS);
	}

	@Override
	protected int getMaxPerfiles() {
		return maxPerfiles;
	}
}
