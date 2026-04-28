package cadenaDeMontaje;

public class EnsamblajePremium extends EnsamblajeMovil {

    @Override
    public void colocarPantalla() {
        System.out.println("2. [PREMIUM] Colocando pantalla OLED curva.");
    }

    @Override
    public void empaquetar() {
        System.out.println("3. [PREMIUM] Empaquetando en caja de lujo con auriculares.");
    }

}