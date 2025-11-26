package Strings;

import java.util.Scanner;
public class ContarCaracter {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase = escaner.nextLine();
		
		System.out.print("Introduce un caracter: ");
		String miCaracter = escaner.nextLine();
		
		
		char caracterBuscado = miCaracter.charAt(0);
		int contador = 0;

		contador =0;
		for (int i = 0; i < frase.length();i++ ) {
			if (frase.charAt(i) == caracterBuscado) {
				contador++;
			}
			
		
		}
	System.out.print("La frase que introduciste contiene la letra " + miCaracter + " " + contador + " veces.");

	}

}
