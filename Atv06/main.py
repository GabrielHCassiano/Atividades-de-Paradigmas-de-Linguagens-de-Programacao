
def coletar_dados():

    dados = []
    while True:
        nome = input("Digite o nome ('sair' para encerrar): ")
        if nome.lower() == 'sair':
            break

        idade = input("Digite a idade: ")
        try:
            idade = int(idade)
        except ValueError:
            print("Idade deve ser um número inteiro. Tente novamente.")
            continue

        telefone = input("Digite seu telefone: ")
        try:
            telefone = int(telefone)
        except ValueError:
            print("O Telefone deve ser um número inteiro. Tente novamente.")
            continue

        dados.append({'nome': nome, 'idade': idade, 'telefone': telefone})
    return dados

def salvar_em_arquivos(dados, nome_arquivos):

    with open(nome_arquivos, 'w') as arquivo:
        for item in dados:
            linha = f"Nome: {item['nome']}, Idade: {item['idade']}, Telefone: {item['telefone']}\n"
            arquivo.write(linha)

def main():

    dados = coletar_dados()
    if dados:
        salvar_em_arquivos(dados, "Atv06/dados_pessoas.txt")
        print("Dados salvos no arquivo 'dados_pessoas.txt'.")
        salvar_em_arquivos(dados, "Atv06/dados_pessoas.csv")
        print("Dados salvos no arquivo 'dados_pessoas.csvsad'.")
        salvar_em_arquivos(dados, "Atv06/dados_pessoas.json")
        print("Dados salvos no arquivo 'dados_pessoas.json'.")
    else:
        print("Nenhum dado foi coletado.")

if __name__ == "__main__":
    main()


