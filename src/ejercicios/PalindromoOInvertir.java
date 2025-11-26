package ejercicios;

import java.util.Scanner;

public class PalindromoOInvertir {
	
	public static boolean esPalindromo(String p) {
	for (int i=0; i<(p.length())/2 ;i++) {
		if (p.charAt(i)!=p.charAt(p.length()-(i+1))) {
			return false;
		}
	}
		return true;
	}
	
	
	public static String cadenaInvertida (String cadena) {
		String cadenaInvertida;
		StringBuilder cadenaTemporal = new StringBuilder();
		
		for(int i=cadena.length()-1;i>=0;i--) {
			cadenaTemporal.append(cadena.charAt(i));
		}
		
		cadenaInvertida = cadenaTemporal.toString();
		
		return cadenaInvertida;
	}
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String palabraInvertida;
		 
		 System.out.println("Dime una palabra y vamops a ver si es palindromo o no");
		 String palabra =sc.nextLine();
		 
		 if(esPalindromo(palabra)) {
			 System.out.print("La palabra es palindromo.");
		 }else
			 System.out.print("La palabra no es palindromo, al revés es:"
			 		+ " " + cadenaInvertida(palabra));
		
	}
}
