package Aula04.Java;

public class Carro {
    public String marca;
    public String modelo;
    public Motor motor;
    public Pneu[] pneus;

    public Carro (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor("Gasolina", 150);
        this.pneus = new Pneu[4];
        for (int i = 0; i < 4; i++)
            this.pneus[i] = new Pneu("Pirelli", 18);
    }

    public void ligar() {
        motor.ligar();
        System.out.println("O carro está pronto para rodar.");

    }

    public void desligar() {
        motor.desligar();
        System.out.println("O carro foi desligado.");
    }

    public void trocar_pneu(int indice, Pneu novo_pneu) {
        pneus[indice] = novo_pneu;
        System.out.println("Pneu " + (indice + 1) + " trocado.");
    }
}
