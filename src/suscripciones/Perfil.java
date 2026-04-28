package suscripciones;


public class Perfil {
	private String nombre;
	private int edad;


	public Perfil(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		if (edad<0) {
			return edad=0;
		}else {
		return edad;
		}
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Perfil [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
