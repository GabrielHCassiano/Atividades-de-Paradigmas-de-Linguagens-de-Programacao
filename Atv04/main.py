from funcao import Inserir_no_Vetor, Achar_Maior_e_Menor, Print_Maior_e_Menor

def main():
    vetor = []

    vetor = Inserir_no_Vetor(vetor)

    maior = vetor[0]
    menor = vetor[0]
    
    maior, menor = Achar_Maior_e_Menor(vetor, maior, menor)

    Print_Maior_e_Menor(maior, menor)
    
if __name__ == '__main__':
    main()