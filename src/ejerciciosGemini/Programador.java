package ejerciciosGemini;

public class Programador extends Empleado{

	private String lenguaje;
	
	public Programador(String nombre, double salario, String lenguaje) {
		super(nombre, salario);
		this.lenguaje=lenguaje;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Lenguaje: " + this.lenguaje);
	}

}
