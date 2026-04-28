package termometro;

public class Termometro {

	private double temperatura;
	
	public Termometro(double temperatura, String tipo) {
		setTemperatura(temperatura);
		this.setTemperatura(temperatura); // Usamos el setter para que valide el -273.15
	}
	
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperaturaUsuario) {
		if (temperaturaUsuario < -273.15) {
			System.out.print("Introduce una temperatura válida");
		}else {
			temperatura=temperaturaUsuario;
			System.out.print("Temperatura actualizada correctamente.");
		}
	}
	
}