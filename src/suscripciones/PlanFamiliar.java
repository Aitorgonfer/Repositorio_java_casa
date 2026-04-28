package suscripciones;

public class PlanFamiliar extends Suscripcion{

	public PlanFamiliar(String nombreDeUsuario, double precioBase) {
		super(nombreDeUsuario, precioBase);
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase()*1.40;
	}
	
	@Override
	public int getLimitePerfiles() {
		return 5;
	}
	
	
	
}
