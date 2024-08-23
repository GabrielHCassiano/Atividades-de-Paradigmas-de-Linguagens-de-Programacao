
from funcao import definir_vetor, inserir_no_vetor, inserir_X_e_Y, soma_valor_X_e_Y, imprime_soma

def main():


  vetor = definir_vetor()

  vetor = inserir_no_vetor(vetor)

  x, y = inserir_X_e_Y()
  
  soma = soma_valor_X_e_Y(vetor, x, y)

  imprime_soma(soma)

if __name__ == "__main__":
    main()