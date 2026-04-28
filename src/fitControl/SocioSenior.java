package fitControl;

public class SocioSenior extends Socio{
	private int edad;
	
	public SocioSenior(String nombre, double cuotaBase, int edad) {
		super(nombre, cuotaBase);
		this.edad=edad;
	}

	@Override
	protected double calcularPrecio() {
		return (getCuotaBase() * 0.8);
	}

	@Override
	protected int getLimiteActividades() {
		return 2;
	}

	
	
}
