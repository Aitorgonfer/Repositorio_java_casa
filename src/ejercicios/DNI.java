package ejercicios;

import java.util.Scanner;

public class DNI {
	
	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKED";
	
	public static boolean tieneFormatoValido( String dni) {
		String dniSinLetra;
	
		dniSinLetra=dni.substring(0,8);
		int dniNumerico=Integer.valueOf(dniSinLetra);
		
		char letra=dni.charAt(dni.length()-1);
		
		char letraBuena;
		int resto = dniNumerico%23;
		letraBuena=LETRAS.charAt(resto);
		
		if (letra==letraBuena) {
			return true;
		}else
		return false;
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un DNI y te digo si existe o no: ");
		String DNI = sc.nextLine();
		if(tieneFormatoValido(DNI)){
			System.out.println("La letra es correcta");
		}else
			System.out.println("La letra es incorrecta");
		
	}
}  