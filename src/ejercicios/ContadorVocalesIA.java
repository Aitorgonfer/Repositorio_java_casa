package ejercicios;

import java.util.Scanner;

public class ContadorVocalesIA {
	
	final static String LETRAS = "aeiouAEIOUáéíóúÁÉÍÓÚ";
	
	public static int contadorVocales(String frase) {
		int cantidad=0;
		for(int i=0;i<frase.length();i++) {
			if(LETRAS.indexOf(frase.charAt(i))!=-1) {
				cantidad++;
			}
		
		}
		return cantidad;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra o frase y te dire cuantas vocales tiene.");
		String frase = sc.nextLine();
		System.out.print("La palabra/frase: " + frase + " tiene " + contadorVocales(frase) + " vocales.");
		
	}
}