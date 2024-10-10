class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0
        self.motor = Motor()

    def exibir(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}")

    def acelerar(self, forca):
        if self.velocidade + forca > 120:
            self.velocidade = 120
        else:
            self.velocidade += forca

    def frear(self, forca):
        if self.velocidade - forca < 0:
            self.velocidade = 0
        else:
            self.velocidade -= forca

    def velocidadeAtual(self):
        print(f"Velocidade: {self.velocidade}")

class Motor:
    pass

carro1 = Carro("Marca1", "Modelo1", 2007)
carro2 = Carro("Marca2", "Modelo2", 1992)
carro3 = Carro("Marca3", "Modelo3", 2000)

carro1.exibir()
carro2.exibir()
carro3.exibir()

carro1.acelerar(20)
carro1.velocidadeAtual()
carro1.frear(25)
carro1.velocidadeAtual()
