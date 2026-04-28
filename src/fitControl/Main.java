package fitControl;

public class Main {
	
	public static void main(String[] Args) {
		
		SocioBasico Aitor = new SocioBasico("Aitor", 50);
		Aitor.añadirActividad(new Actividad("Correr", "Alta"));
		System.out.println(Aitor);
	}
}
