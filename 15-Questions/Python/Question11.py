class Funcionario:
    def calcularSalario(self, tempo, valor):
        pass

class FuncionarioHorista(Funcionario):
    def calcularSalario(self, horas, valor):
        print(f"Salario: R$ ", (horas * valor), ", por tantas horas ", horas)

class FuncionarioAssalariado(Funcionario):
    def calcularSalario(self, meses, valor):
        print(f"Salario: R$ ", (meses * valor), ", por tantos meses ", meses)

funcionarioHorista1 = FuncionarioHorista()
funcionarioAssalariado1 = FuncionarioAssalariado()

funcionarioHorista1.calcularSalario(120, 10)
funcionarioAssalariado1.calcularSalario(2, 1200.00)