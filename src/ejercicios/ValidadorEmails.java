package ejercicios;

import java.util.Scanner;

public class ValidadorEmails {

	public static boolean esEmailValido(String email) {
		
		
		if (email.indexOf('@') == -1 || email.indexOf(' ') != -1) {
			return false; 
		}
		
		String final3 =email.substring(email.length()-3);
		String final4 =email.substring(email.length()-4);
		
		if(final3.equals(".es")||final4.equals(".com")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu email: ");
		String correo = sc.nextLine();
		
		if (esEmailValido(correo)) {
			System.out.println("El email es válido ✅");
		} else {
			System.out.println("El email NO es válido ❌");
		}
	}
}