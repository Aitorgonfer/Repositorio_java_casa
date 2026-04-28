package ejerciciosGemini;

public class Superheroe {

	private String nombre;
	private String poder;
	private int nivelPoder;
	
	public Superheroe(String nombre, String poder) {
		
		this.nombre = nombre;
		this.poder = poder;
		this.nivelPoder = 10;
	}
	
	public void entrenar(int mejora) {
		this.nivelPoder=this.nivelPoder + mejora;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", poder=" + poder + ", nivelPoder=" + nivelPoder + "]";
	}	
	
}
