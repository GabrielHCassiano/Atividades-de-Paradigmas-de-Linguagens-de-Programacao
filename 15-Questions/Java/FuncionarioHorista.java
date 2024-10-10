package Java;

public class FuncionarioHorista extends Funcionario {
    
    public void CalcularSalario(int horas, double valor) {
        double salario = valor * horas;
        System.out.println("Salario: R$ " + salario + ", por tantas horas " + horas);
    }

}
