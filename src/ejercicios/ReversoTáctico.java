package ejercicios;

import java.util.Scanner;

public class ReversoTáctico {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una frase y te la devuelvo del reves: ");
		String frase = sc.nextLine();
		StringBuilder sb = new StringBuilder(frase); 
		sb.reverse();
		System.out.print(sb);
		
	}
}