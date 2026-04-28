package hotelBoutique;

public abstract class Persona {

	private String nombre;
	private String DNI;
	private int edad;
	
	public Persona(String nombre, String DNI, int edad) {
		this.nombre = nombre;
		this.DNI= DNI;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
