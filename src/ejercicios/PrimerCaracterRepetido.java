package ejercicios;

import java.util.Scanner;

public class PrimerCaracterRepetido {

	public static String primerCaracter(String frase) {
		frase=frase.toLowerCase();
		for (int i=0; i<=frase.length()-1;i++) {
			for (int j=i+1; j<=frase.length()-1;j++) {
				if (frase.charAt(j)==frase.charAt(i)) {
					return String.valueOf(frase.charAt(i));
				}
			}
		}

		return "ninguno";
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una palabra y te digo cual "
				+ "es el primer carácter que se repite: ");
		String frase=sc.nextLine();
		System.out.println("El primer cáracter repetido es: " + primerCaracter(frase));

	}

}