package realStreamMaster;

import java.util.ArrayList;

public abstract class Suscripcion {

	private String nombreUsuario;
	private final double precioBase;
	private ArrayList<Perfil> perfiles = new ArrayList<>();
	
	public Suscripcion(String nombreUsuario, double precioBase) {
		this.nombreUsuario = nombreUsuario;
		if (precioBase<0) {
			this.precioBase=100;
		}else {
			this.precioBase = precioBase;
		}
		
		
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	protected abstract double calcularPrecio();
	
	protected abstract int getMaxPerfiles();
	
	protected void añadirPerfil(Perfil p ) {
		if(getPerfiles().size() >= getMaxPerfiles()) {
			System.out.print("Tu lista está llena, no puedes añadir más perfiles");
		}else {
			getPerfiles().add(p);
		}
	}
	protected ArrayList<Perfil> getPerfiles() {
		return perfiles;
	}

	@Override
	public String toString() {
		return "Suscripcion [nombreUsuario=" + nombreUsuario + ", precioBase=" + precioBase + ", perfiles=" + perfiles
				+ "]";
	}
	
	
}
