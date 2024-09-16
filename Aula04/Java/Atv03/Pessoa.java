
public class Pessoa {
    
    public String nome;
    public int idade;
    public Endereco endereco;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = null;
    }

    public void adicionar_endereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void mostrar_informacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        if (endereco != null) {
            System.out.println("Endereço: ");
            endereco.mostrar_endereco();
        }
        else
            System.out.println("Endereço: não disponível");
    }

}
