package ejerciciosGemini;

public class Empleado {

	protected String nombre;
	protected double salario;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public void mostrarDatos() {
        System.out.println("Empleado: " + this.nombre + " | Salario: " + this.salario + "€");
    }
}