package ejerciciosGemini;

public class Coche {

	private Motor miMotor = new Motor();
	
	public void arrancarCoche() {
		miMotor.encender();
		System.out.println("El coche ha arrancado.");
	}
	
	public void pararCoche() {
        miMotor.apagar();
        System.out.println("El coche se ha apagado.");
    }
}
