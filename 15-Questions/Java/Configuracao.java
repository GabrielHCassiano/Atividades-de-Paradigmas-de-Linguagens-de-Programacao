package Java;

public class Configuracao {
    private static Configuracao instancia;

    private Configuracao() {

    }

    public static synchronized Configuracao getInstancia() {
        if (instancia == null)
            instancia = new Configuracao();

        return instancia;
    }
}
