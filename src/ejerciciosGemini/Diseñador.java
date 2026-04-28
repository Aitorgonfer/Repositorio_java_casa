package ejerciciosGemini;

public class Diseñador extends Empleado{

	private String herramienta;
	
	public Diseñador(String nombre, double salario, String herramienta ) {
		super(nombre, salario);
		this.herramienta=herramienta;
	}

	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Herramienta: " + this.herramienta);
	}

}
