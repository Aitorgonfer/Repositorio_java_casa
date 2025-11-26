package Strings;

import java.util.Scanner;

public class PalabraLarga {
	public static void main(String[] args) {
		Scanner escaner=new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = escaner.nextLine();
	
		System.out.print("Introduce una palabra: ");
		String palabra2 = escaner.nextLine();
		
		if (palabra.length()>8 || palabra2.length()>8) {
			System.out.print("Una o dos de las palabras son demasiado largas");
		}
		
	}
}
