package Aula04.Java;

public class Cachorro extends Animal {

    public Cachorro(String especie, String nome) {
        super(especie, nome);
    }

    public String emitirSom() {
        return "Au Au";
    }
}
