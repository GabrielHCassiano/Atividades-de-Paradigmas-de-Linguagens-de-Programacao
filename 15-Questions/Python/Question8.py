class Empresa:
    def __init__(self):
        self.empregado = []

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

empresa1 = Empresa()

empregado1 = Empregado("Nome1", "Cargo1", 1000.00)
empregado2 = Empregado("Nome2", "Cargo2", 1500.00)
empregado3 = Empregado("Nome3", "Cargo3", 850.00)


