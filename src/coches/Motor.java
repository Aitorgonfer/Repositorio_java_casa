package coches;

public class Motor {

	private String tipo;
	private int potencia;
	
	public Motor(String tipo, int potencia){
		this.tipo=tipo;
		this.potencia=potencia;
	}
	
	public String getInfo(){
		return ("El motor es de tipo " + tipo + " y tiene una potencia de " + potencia + "CV");
	}
}
