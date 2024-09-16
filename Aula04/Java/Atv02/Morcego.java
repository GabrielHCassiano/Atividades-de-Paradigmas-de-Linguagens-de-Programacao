
public class Morcego extends Animal implements Mamifero, Ave {

    public Morcego (String especie, String nome) {
        super(especie, nome);
    }

    public String emitirSom() {
        return "Morcego fazendo ruídos noturnos.";
    }

    public String amamentar() {
        return nome + " está amamentando.";
    }

    public String voar() {
        return nome + " está voando.";
    }
}