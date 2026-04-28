package redDeGimnasios;

import java.util.ArrayList;

public class AppGimnasio {

	public static void main(String[] args) {

		ArrayList<Entrenamiento>listaSocios = new ArrayList<>();

		listaSocios.add(new PlanEstandar("Ana", 50));
		listaSocios.add(new PlanFamiliar("Familia González", 100, 4));
		listaSocios.add(new PlanPremium("Luis", 60.0, 30.0));

		double total=0;
		Entrenamiento socioMasCaro=null;

		for(Entrenamiento e : listaSocios) {
			double precioFinal = e.calcularPrecio();
			total += precioFinal;

			System.out.println("Socio: " + e.getNombreSocio() + " | Precio final: " + precioFinal + "€");

			if (socioMasCaro == null || precioFinal > socioMasCaro.calcularPrecio()) {
				socioMasCaro=e;
			}

		}

		if(socioMasCaro!=null) {
			System.out.println("El socio con la cuota más alta es: " + socioMasCaro.getNombreSocio() + 
					" con " + socioMasCaro.calcularPrecio() + "€");
		}

	}

}
