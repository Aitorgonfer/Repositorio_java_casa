package Strings;

import java.util.Scanner;

public class PalabraVertical {
	public static void main(String[] args) {
		System.out.print("Escribe una palabra o frase y te la escribo en vertical: ");
		Scanner escaner = new Scanner(System.in);
		String palabra = escaner.nextLine();
		
		
		for (int i = 0; i < palabra.length();i++ ) {
			System.out.println(palabra.charAt(i));
		}
	}

}
