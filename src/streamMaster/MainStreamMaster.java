package streamMaster;

import java.util.ArrayList;

public class MainStreamMaster {

	public static void main(String[] args) {
		ArrayList<Suscripcion> listaUsuarios = new ArrayList<>();
		
		listaUsuarios.add(new PlanEstudiante("pedro@uva.es", 10.0, "UVA"));
        listaUsuarios.add(new PlanPremium("ana@vip.com", 10.0, true));
        
        double totalIngresos=0;
        
        for(Suscripcion s : listaUsuarios) {
        	System.out.println(s.toString()); // Muestra cada usuario
        	totalIngresos += s.calcularPrecioFinal();
        }
        System.out.println("---------------------------------");
        System.out.println("INGRESOS TOTALES DEL MES: " + totalIngresos + "€");
	}
	
}