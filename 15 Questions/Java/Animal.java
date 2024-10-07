public class Animal {
    
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void Som() {

    }

    public static void SonsAnimais(Animal[] animais) {
        for (int i = 0; i < animais.length; i++)
            animais[i].Som();
    }

}
