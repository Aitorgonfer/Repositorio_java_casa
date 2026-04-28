package realStreamMaster;

import java.util.ArrayList;

public class AppStreamMaster {

	public static void main(String[] args) {

		ArrayList<Suscripcion> misCuentas = new ArrayList<>();
		
		PlanEstandar pedro = new PlanEstandar("Netflix", 10.99);
        pedro.añadirPerfil(new Perfil("Padre", 45));
        
        misCuentas.add(pedro);
        
		for(Suscripcion s : misCuentas) {
			System.out.println(s);
		}
		
		
	}

}
