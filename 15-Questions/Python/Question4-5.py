class Animal:
    def __init__(self, nome):
        self.nome = nome

    def som(self):
        pass

class Cachorro(Animal):
    def __init__(self, nome):
        super().__init__(nome)

    def som(self):
        print(f"Au Au")


class Gato(Animal):
    def __init__(self, nome):
        super().__init__(nome)

    def som(self):
        print(f"Miau")

def exibir_som(animais):
    for animal in animais:
        animal.som()

cachorro1 = Cachorro("Nome1")
gato1 = Gato("Nome2")

cachorro1.som()
gato1.som()

animais = [cachorro1, gato1]
exibir_som(animais)