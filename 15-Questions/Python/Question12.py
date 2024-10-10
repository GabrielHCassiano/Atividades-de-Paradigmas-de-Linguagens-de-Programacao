class Loja:
    def somarProdutor(self, produtos):
        resultado = 0
        
        for produto in range(len(produtos)):
            resultado += produtos[produto].valor

        print(resultado)

class Produtor:
    def __init__(self, valor):
        self.valor = valor

loja1 = Loja()

produtor1 = Produtor(2.99)
produtor2 = Produtor(14.99)
produtor3 = Produtor(5.25)

produtos = [produtor1, produtor1, produtor2, produtor3]

loja1.somarProdutor(produtos)
    