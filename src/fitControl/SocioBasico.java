package fitControl;

public class SocioBasico extends Socio{

	public SocioBasico(String nombre, double cuotaBase) {
		super(nombre, cuotaBase);
	}

	@Override
	protected double calcularPrecio() {
		return getCuotaBase();
	}

	@Override
	protected int getLimiteActividades() {
		return 1;
	}

	
	
}
