package ejercicios;

import java.util.Scanner;

public class CirujanoTextos {

	public static void SB() {
		StringBuilder sb=new StringBuilder("Hola mundo cruel");
		sb.delete(11,16);
		sb.insert(11,"bonito");
		System.out.print(sb);
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SB();

	}

}