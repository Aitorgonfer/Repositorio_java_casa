package cadenaDeMontaje;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- FABRICANDO MÓVIL PREMIUM ---");
        
        EnsamblajePremium miMovil = new EnsamblajePremium();
        EnsamblajeMovil miMovil2 = new EnsamblajeMovil();
        
        miMovil.fabricar();
        miMovil2.fabricar();
    }
}