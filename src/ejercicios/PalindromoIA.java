package ejercicios;

import java.util.Scanner;

public class PalindromoIA {

	public static boolean esPalindromo(String palindromo) {
		String invertido="";
		palindromo=palindromo.toLowerCase();
		palindromo=palindromo.replace(" ", "");
		for(int i=palindromo.length()-1;i>=0;i--) {
			invertido=invertido+palindromo.charAt(i);
		}
		
		return palindromo.equals(invertido);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una palabra y te digo si es palindromo");
		String palindromo = sc.nextLine();
		
		System.out.print(esPalindromo(palindromo));
	}

}