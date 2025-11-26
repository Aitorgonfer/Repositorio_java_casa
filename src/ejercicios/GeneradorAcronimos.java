package ejercicios;

import java.util.Scanner;

public class GeneradorAcronimos {

	public static String genAcronimos(String frase) {
		String acronimo="";
		for (int i=0; i<frase.length();i++) {
			if(i==0||frase.charAt(i-1)==' ') {
				acronimo=acronimo+frase.charAt(i);
			}
		}
		return acronimo.toUpperCase();
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase y te la hago acrónima: ");
		String frase=sc.nextLine();
	System.out.println("El acrónimo es: " + genAcronimos(frase));
	}
}