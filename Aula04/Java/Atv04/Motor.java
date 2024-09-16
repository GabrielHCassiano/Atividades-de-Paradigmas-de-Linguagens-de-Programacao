
public class Motor {
    
    public String tipo;
    public int potecia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potecia = potencia;
    }

    public void ligar() {
        System.out.println("O motor está ligando.");
    }

    public void desligar() {
        System.out.println("O motor está desligado.");
    }
}
