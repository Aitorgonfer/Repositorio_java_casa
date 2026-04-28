package suscripciones;

public class PlanEstandar extends Suscripcion{

	public PlanEstandar(String nombreDeUsuario, double precioBase) {
		super(nombreDeUsuario, precioBase);
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase();
	}

	@Override
	public int getLimitePerfiles() {
		return 1;
	}

	
}
