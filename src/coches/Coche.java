package coches;

public class Coche {

	private String marca;
	private String modelo;
	private Motor motor;
	
	public Coche(String marca, String modelo, String tipoMotor, int potenciaMotor){
		this.marca=marca;
		this.modelo=modelo;
		this.motor= new Motor(tipoMotor, potenciaMotor);
	}
	
	public void mostrarInfo() {
		System.out.println("---FICHA DEL VEHÍCULO---");
		System.out.println("Coche: " + marca + " " + modelo);
		System.out.println("Detalles: " + motor.getInfo());
        System.out.println("--------------------------");
	}
}
