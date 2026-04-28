package ejerciciosGemini;

public class MainCoche {

	public static void main(String[] args) {
		CocheSimple miCoche = new CocheSimple();
		
		miCoche.viajar(100);
        miCoche.viajar(50);
        
        System.out.println(miCoche);
	}
}