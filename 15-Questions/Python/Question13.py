class Matematica:
    def fatorial(self, valor):
        valorFinal = 1
        for num in range(valor):
            valorFinal *= num + 1

        print("Fatoria de ", valor,  ": ", valorFinal)

matematica1 = Matematica()
matematica1.fatorial(3)
matematica1.fatorial(7)
matematica1.fatorial(0)
matematica1.fatorial(10)