package ejerciciosGemini;

public class MainMonedero {
    public static void main(String[] args) {
        // 1. Instanciamos el objeto (Creamos el monedero)
        Monedero miCartera = new Monedero();

        // 2. Probamos ingresar dinero
        miCartera.meterDinero(100.0);
        
        // 3. Probamos sacar dinero (Caso correcto)
        miCartera.sacarDinero(30.0);
        
        // 4. Probamos el "Guardián": Intentamos sacar más de lo que hay
        miCartera.sacarDinero(150.0); // Debería imprimir el error
        
        // 5. Imprimimos el estado final
        System.out.println(miCartera);
    }
}