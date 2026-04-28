package streamMaster;

public abstract class Suscripcion {

	protected String email;
	protected double cuotaBase=10;
	
	public Suscripcion(String email, double cuotaBase) {
		this.email = email;
		this.cuotaBase = cuotaBase;
	}

	public abstract double calcularPrecioFinal();

	@Override
	public String toString() {
	    return "Usuario: " + email + 
	           " | Plan: " + this.getClass().getSimpleName() + 
	           " | Total a pagar: " + calcularPrecioFinal() + "€";
	}

	
}
