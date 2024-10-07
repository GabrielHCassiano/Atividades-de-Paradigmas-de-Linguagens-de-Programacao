public class FuncionarioAssalariado extends Funcionario{

    public void CalcularSalario(int meses, double valor) {
        double salario = valor * meses;
        System.out.println("Salario: R$ " + salario + ", por tantos meses " + meses);
    }
}