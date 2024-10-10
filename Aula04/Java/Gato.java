package Aula04.Java;

public class Gato extends Animal {

    public Gato(String especie, String nome) {
        super(especie, nome);
    }

    public String emitirSom() {
        return "Miau";
    }
}
