package main

import (
	"fmt"
)

type Pessoa struct {
	Nome     string
	Idade    int
	Endereco Endereco
}

type Endereco struct {
	Rua    string
	Cidade string
	Estado string
	CEP    string
}

type Empresa struct {
	Nome         string
	CNPJ         string
	Funcionarios []Pessoa
}

func (Pessoa *Pessoa) Adicionar_endereco(Endereco *Endereco) {
	Pessoa.Endereco = *Endereco
}

func (Pessoa *Pessoa) Mostrar_informacoes() {
	fmt.Println("Nome:", Pessoa.Nome, ", Idade:", Pessoa.Idade)
	Pessoa.Endereco.Mostrar_endereco()
}

func (Endereco *Endereco) Mostrar_endereco() {
	fmt.Println("Rua:", Endereco.Rua, ", Cidade:", Endereco.Cidade, ", Estado:", Endereco.Estado, ", CEP:", Endereco.CEP)
}

func (Empresa *Empresa) Constratar_funcionario(funcionario Pessoa) {
	Empresa.Funcionarios = append(Empresa.Funcionarios, funcionario)
}

func (Empresa *Empresa) Listar_funcionarios() {
	fmt.Println("Funcionários da Empresa", Empresa.Nome)
	for _, funcionario := range Empresa.Funcionarios {
		fmt.Println(funcionario.Nome)
	}
}

func main() {

	var endereco1 Endereco = Endereco{"Av. Principal", "Cidade A", "EStado X", "12345-678"}
	var pessoa1 Pessoa = Pessoa{"João", 30, Endereco{}}
	pessoa1.Adicionar_endereco(&endereco1)
	pessoa1.Mostrar_informacoes()

	var endereco2 Endereco = Endereco{"Rua Secundária", "Cidade B", "EStado Y", "98765-432"}
	var pessoa2 Pessoa = Pessoa{"Maria", 25, Endereco{}}
	pessoa2.Adicionar_endereco(&endereco2)
	pessoa2.Mostrar_informacoes()

	var empresa = Empresa{"ABC", "12345678901234", nil}
	empresa.Constratar_funcionario(pessoa1)
	empresa.Constratar_funcionario(pessoa2)

	empresa.Listar_funcionarios()

}
