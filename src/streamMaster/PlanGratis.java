package streamMaster;

public class PlanGratis extends Suscripcion {

    public PlanGratis(String email) {
        super(email, 0);
    }

    @Override
    public double calcularPrecioFinal() {
        return 0; 
    }
}