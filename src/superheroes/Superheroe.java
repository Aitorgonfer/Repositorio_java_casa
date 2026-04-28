package superheroes;

public class Superheroe {
	
	private String nombre;
	private String superpoder;
	private boolean capa;
	
	public Superheroe(String nombre, String superpoder) {
		this.nombre=nombre;
		this.superpoder=superpoder;
		this.capa=true;
	}
	
	public void describir() {
		String estadoCapa;
		if (this.capa) {
			estadoCapa="llevo capa";
		}else
			estadoCapa="no llevo capa";
		
		System.out.println("Soy " + nombre + ", mi poder es " + superpoder + " y " + estadoCapa + ".");
	}
	
	public void setCapa(boolean tieneCapa) {
		this.capa=tieneCapa;
	}
}