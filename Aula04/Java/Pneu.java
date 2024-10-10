package Aula04.Java;

public class Pneu {

    public String marca;
    public int tamanho;

    public Pneu(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void inflar() {
        System.out.println("O pneu está inflado.");
    }

    public void desinflar() {
        System.out.println("O pneu está desinflado.");
    }
}
