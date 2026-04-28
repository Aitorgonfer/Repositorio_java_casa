package realStreamMaster;

public class PlanEstandar extends Suscripcion{

	private int maxPerfiles = 1;
	
	public PlanEstandar(String nombreUsuario, double precioBase) {
		super(nombreUsuario, precioBase);
	}

	@Override
	protected double calcularPrecio() {
		// TODO Auto-generated method stub
		return getPrecioBase();
	}

	@Override
	protected int getMaxPerfiles() {
		// TODO Auto-generated method stub
		return maxPerfiles;
	}
	
}
