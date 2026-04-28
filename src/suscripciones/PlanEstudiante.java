package suscripciones;

public class PlanEstudiante extends Suscripcion{
	private String universidad;
	
	public PlanEstudiante(String nombreDeUsuario, double precioBase, String universidad) {
		super(nombreDeUsuario, precioBase);
		this.universidad=universidad;
	}

	@Override
	public double calcularPrecio() {
		return getPrecioBase() * 0.50;
	}

	@Override
	public int getLimitePerfiles() {
		return 1;
	}

	public String getUniversidad() {
		return universidad;
	}
	
}
