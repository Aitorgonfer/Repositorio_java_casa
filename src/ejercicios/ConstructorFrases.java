package ejercicios;

import java.util.Scanner;

public class ConstructorFrases {

	public static void SB(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++) {
			sb.append(i);
			if(i<n) {
			sb.append(" - ");
		}
	}
		System.out.println(sb);
}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu cantidad");
		int n = sc.nextInt();
		SB(n);
		
	}

}