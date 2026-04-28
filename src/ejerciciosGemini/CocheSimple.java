package ejerciciosGemini;

public class CocheSimple {

	public int kilometraje;
	
	public CocheSimple() {
		this.kilometraje = 0;
	}
	
	public void viajar(int km) {
		this.kilometraje=this.kilometraje+km;
		System.out.println("El coche va a " + kilometraje + " km/h");
	}

	@Override
	public String toString() {
		return "CocheSimple [kilometraje=" + kilometraje + "]";
	}
}