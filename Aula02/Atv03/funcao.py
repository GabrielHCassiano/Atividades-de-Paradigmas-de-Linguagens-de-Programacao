
def definir_vetor():
    vetor = [0] * 8
    return vetor

def inserir_no_vetor(vetor):
    for i in range(8):
        vetor[i] = int(input("Digite o valor da posição {}: ".format(i)))
    return vetor

def inserir_X_e_Y():
    return int(input("Digite o valor de X: ")), int(input("Digite o valor de y: "))

def soma_valor_X_e_Y(vetor, x, y):
    return vetor[x] + vetor[y]
    
def imprime_soma(soma):
    print("A soma dos valores nas posições X é Y {}.".format(soma))
