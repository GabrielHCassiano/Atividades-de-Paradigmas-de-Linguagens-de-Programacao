
def Inserir_no_Vetor(vetor):
    for i in range(10):
        vetor.append(int(input("Digite o elemento %d: " % i)))
    return vetor

def Achar_Maior_e_Menor(vetor, maior, menor):
    for i in range(1, len(vetor)):
        if vetor[i] > maior:
            maior = vetor[i]

        elif vetor[i] < menor:
            menor = vetor[i]

    return maior, menor
                

def Print_Maior_e_Menor(maior, menor):
    print("O maior elemento do vetor e %d." %maior)
    print("O menor elemento do vetor e %d." %menor)
