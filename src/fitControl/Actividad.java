package fitControl;

public class Actividad {

	private String nombre;
	private String intensidad;
	
	public Actividad(String nombre, String intensidad) {
		this.nombre = nombre;
		this.intensidad = intensidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(String intensidad) {
		this.intensidad = intensidad;
	}

	@Override
	public String toString() {
		return "Actividad [nombre=" + nombre + ", intensidad=" + intensidad + "]";
	}
	
	
	
}
