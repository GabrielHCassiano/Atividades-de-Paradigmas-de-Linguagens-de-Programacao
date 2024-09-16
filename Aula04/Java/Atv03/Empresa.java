import java.util.List;
import java.util.ArrayList;

public class Empresa {
    public String nome;
    public String cnpj;
    public List<Pessoa> funcionario;

    public Empresa (String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionario = new ArrayList<>();
    }

    public void constratar_funcionario(Pessoa funcionario) {
        this.funcionario.add(funcionario);
    }

    public void listar_funcionarios() {
        System.out.println("Funcionários da Empresa " + nome + ": ");
        for (int i = 0; i < funcionario.size(); i++) {
            System.out.println(funcionario.get(i).nome);
        }
    }
}
