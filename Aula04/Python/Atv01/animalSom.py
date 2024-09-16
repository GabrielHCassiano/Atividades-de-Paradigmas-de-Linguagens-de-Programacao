
class Animal:
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome

    def emitir_som(self):
        pass

class Cachorro(Animal):
    def emitir_som(self):
        return "Au Au"
    
class Gato(Animal):
    def emitir_som(self):
        return "Miau"

cachorro = Cachorro("Alguma", "Bomdia")
print(cachorro.emitir_som())
gato = Gato("2", ":v")
print(gato.emitir_som())