from abc import ABC, abstractstaticmethod

class Imprimivel(ABC):
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        print(f"Imprimir Relatorio")
class Contrato(Imprimivel):
    def imprimir(self):
        print(f"Imprimir Contrato")

relatorio1 = Relatorio()
contrato1 = Contrato()

relatorio1.imprimir()
contrato1.imprimir()