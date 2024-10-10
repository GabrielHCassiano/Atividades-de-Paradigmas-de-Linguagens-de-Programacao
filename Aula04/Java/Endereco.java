package Aula04.Java;

public class Endereco {

    public String rua;
    public String cidade;
    public String estado;
    public String cep;

    public Endereco (String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public void mostrar_endereco() {
        System.out.println("Rua: " + rua + ", Cidade: " + cidade + ", Estado: " + estado + ", CEP: " + cep);
    }
}
