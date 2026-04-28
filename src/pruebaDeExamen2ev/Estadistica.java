package pruebaDeExamen2ev;

public class Estadistica {
	
	public static double mediaAritmetica(Muestra muestra){
		
		double suma=0;
		
		for (int i = 0; i < muestra.getMuestras().size(); i++) {
			suma= suma + muestra.getMuestras().get(i);
		}
		
		return suma/muestra.getMuestras().size();
	}
	
	public static double moda(Muestra muestra) {
		
		int maxContador=0;
		int moda=0;
		
		for (int i = 0; i < muestra.getMuestras().size(); i++) {
			int contador=0;
			for (int j = 0; j < muestra.getMuestras().size(); j++) {
				if (muestra.getMuestras().get(i)==muestra.getMuestras().get(j)) {
					contador++;
				}
			}
			if (contador > maxContador) {
				maxContador=contador;
				moda=muestra.getMuestras().get(i);
			}
		}
		
		return moda;
	}
	
	public static void main(String[] args) {
		
		int[] muestra = {4, 7, 2, 7, 3, 7, 1};
		Muestra temperatura = new Muestra("temperatura",muestra) ;
			
		System.out.println("La media de " + temperatura.getNombre() + " es: " + Estadistica.mediaAritmetica(temperatura));
		System.out.println("La moda de " + temperatura.getNombre() + " es: " + Estadistica.moda(temperatura));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
