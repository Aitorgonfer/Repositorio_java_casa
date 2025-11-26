package ejercicios;

import java.util.Scanner;

public class Alternador {

	public static String SB(String palabra) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<palabra.length();i++) {
			char letra = palabra.charAt(i);
			if (Character.isUpperCase(letra)) {
				sb.append(Character.toLowerCase(letra));
			}else
				sb.append(Character.toUpperCase(letra));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce una palabra y te cambio las mayusculas y minusculas: ");
	String palabra = sc.nextLine();
	System.out.print(SB(palabra));
	}
}