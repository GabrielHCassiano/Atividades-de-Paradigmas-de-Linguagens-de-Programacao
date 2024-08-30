class Retangulo:

    def __init__(self, comprimento, largura):
        self.comprimento = comprimento
        self.largura = largura
    
    def calcular_area(self):
        return self.comprimento * self.largura
    
    def calcular_perimentro(self):
        return 2 * (self.comprimento + self.largura)
    
ret = Retangulo(200, 300)
    
print(f"Área: {ret.calcular_area()}m")
print(f"Perimentro: {ret.calcular_perimentro()}m")