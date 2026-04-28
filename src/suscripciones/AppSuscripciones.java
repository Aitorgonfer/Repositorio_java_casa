package suscripciones;

public class AppSuscripciones {

	public static void main(String[] args) {

		PlanFamiliar pf = new PlanFamiliar("Netflix", 6.99);
		
		Perfil p1 = new Perfil("Aito", 18);
		Perfil p2 = new Perfil("Ait", 18);
		Perfil p3 = new Perfil("Ai", 18);
		Perfil p4 = new Perfil("Ai", 18);
		Perfil p5 = new Perfil("Air", 18);
		Perfil p6 = new Perfil("Air", 18);
		pf.añadirPerfil(p1);
		pf.añadirPerfil(p2);
		pf.añadirPerfil(p3);
		pf.añadirPerfil(p4);
		pf.añadirPerfil(p5);
		pf.añadirPerfil(p6);
		
	}
}