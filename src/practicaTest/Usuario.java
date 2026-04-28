package practicaTest;

public class Usuario {
    // 1. Usa el "escudo familiar" para los atributos
    protected String email;
    protected String password;

    // 2. El constructor
    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // 3. Método que todos heredarán
    public void reproducirVideo(String titulo) {
        System.out.println("Reproduciendo: " + titulo);
    }
}