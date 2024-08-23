import random

def gerar_cartela():
    numeros = set()
    cartela = []
    for i in range(5):
        numero = random.randint(0, 99)
        while numero in numeros:
            numero = random.randint(0, 99)
        numeros.add(numero)
        cartela.append(numero)
    return cartela

def gerar_5_cartelas():
    for i in range(5):
        cartela = gerar_cartela()
        print("Cartela de bingo {}: ".format(i+1))
        for linha in cartela:
            print(linha)

def main():
    gerar_5_cartelas()

if __name__ == "__main__":
    main()