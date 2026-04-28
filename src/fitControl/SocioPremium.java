package fitControl;

public class SocioPremium extends Socio{

	public SocioPremium(String nombre, double cuotaBase) {
		super(nombre, cuotaBase);
	}

	@Override
	protected double calcularPrecio() {
		return (getCuotaBase() * 1.3);
	}

	@Override
	protected int getLimiteActividades() {
		return 4;
	}

	
	
}
