package cadenaDeMontaje;

public class EnsamblajeMovil {

    // Método BLINDADO: El orden no se puede cambiar
    public final void fabricar() {
        colocarPlaca();
        colocarPantalla();
        empaquetar();
    }

    public void colocarPlaca() {
        System.out.println("1. Instalando placa base estándar.");
    }

    public void colocarPantalla() {
        System.out.println("2. Colocando pantalla LCD estándar.");
    }

    public void empaquetar() {
        System.out.println("3. Empaquetando en caja de cartón básica.");
    }
}