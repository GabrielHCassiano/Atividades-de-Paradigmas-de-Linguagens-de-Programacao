package main

import (
	"errors"
	"fmt"
	"sync"
)

type Motor struct {
}

type Carro struct {
	marca      string
	modelo     string
	ano        int
	velocidade float64
	motor      Motor
}

func (c *Carro) Acelerar(forca float64) {
	if c.velocidade+forca > 120 {
		c.velocidade = 120
	} else {
		c.velocidade += forca
	}
}

func (c *Carro) Frear(forca float64) {
	if c.velocidade-forca < 0 {
		c.velocidade = 0
	} else {
		c.velocidade -= forca
	}
}

func (c *Carro) ExibirDetalhe() {
	fmt.Print(c.modelo, c.marca, c.ano, "\n")
}

func (c *Carro) velocidadeAtual() {
	fmt.Print(c.velocidade, "\n")
}

type ContaBancaria struct {
	Saldo   float64
	titular string
}

func (c *ContaBancaria) GetSaldo() float64 {
	return c.Saldo
}

func (c *ContaBancaria) Depositar(valor float64) {
	c.Saldo += valor
}

func (c *ContaBancaria) Sacar(valor float64) {
	if c.Saldo-valor >= 0 {
		c.Saldo -= valor
	} else {
		fmt.Println(errors.New("Error, saldo insuficiente"))
	}
}

type Animal interface {
	Som()
}

type Cachorro struct {
	Animal
}

type Gato struct {
	Animal
}

func (a *Cachorro) Som() {
	fmt.Println("Au Au")
}

func (a *Gato) Som() {
	fmt.Println("Miau")
}

func SomLista(animais []Animal) {
	for _, animal := range animais {
		animal.Som()
	}
}

type Escola struct {
	professor []Professor
}

type Professor struct {
}

type Empresa struct {
	empregado []Empregado
}

type Empregado struct {
	nome    string
	cargo   string
	salario float64
}

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct{}

type Contrato struct{}

func (r *Relatorio) Imprimir() {
	fmt.Println("Imprimir relatorio")
}

func (c *Contrato) Imprimir() {
	fmt.Println("Imprimir contrato")
}

type Calculadora struct {
}

func (c *Calculadora) Soma2(valor1 int, valor2 int) {
	fmt.Println(valor1 + valor2)
}

func (c *Calculadora) Soma3(valor1 int, valor2 int, valor3 int) {
	fmt.Println(valor1 + valor2 + valor3)
}

type Funcionario interface {
	CalcularSalario()
}

type FuncionarioHorista struct {
}

type FuncionarioAssalariado struct {
}

func (f *FuncionarioHorista) CalcularSalario(valor int, horas int) {
	var salario = valor * horas
	fmt.Println("Salario: R$ ", salario, ", por tantas horas ", horas)
}

func (f *FuncionarioAssalariado) CalcularSalario(valor int, meses int) {
	var salario = valor * meses
	fmt.Println("Salario: R$ ", salario, ", por tantos meses ", meses)
}

type Loja struct {
}

type Produto struct {
	valor float64
}

func (l *Loja) SomarProduto(produtos ...Produto) {
	var resultado float64
	for _, produto := range produtos {
		resultado += produto.valor
	}
	fmt.Println(resultado)
}

type Matematica struct {
}

func (m *Matematica) Fatorial(valor int) {
	var resultado int = 1
	for i := 1; i <= valor; i++ {
		resultado *= i
	}

	fmt.Println(resultado)
}

var lock = &sync.Mutex{}

type Configuracao struct {
	valor int
}

var singleInstance *Configuracao

func GetInstance() *Configuracao {
	if singleInstance == nil {
		lock.Lock()
		defer lock.Unlock()
		if singleInstance == nil {
			singleInstance = &Configuracao{}
		}
	}

	return singleInstance
}

func main() {

	//Question 1, 2 e 6

	println("---Question 1, 2 e 6---")

	var carro1 Carro = Carro{"Marca1\t", "Modelo1\t", 2004, 0, Motor{}}
	var carro2 Carro = Carro{"Marca2\t", "Modelo2\t", 2024, 0, Motor{}}
	var carro3 Carro = Carro{"Marca3\t", "Modelo3\t", 1997, 0, Motor{}}

	carro1.ExibirDetalhe()
	carro2.ExibirDetalhe()
	carro3.ExibirDetalhe()

	carro1.velocidadeAtual()
	carro1.Acelerar(30)
	carro1.velocidadeAtual()
	carro1.Frear(10)
	carro1.velocidadeAtual()
	carro1.Frear(40)
	carro1.velocidadeAtual()

	//Question 3

	println("---Question 3---")

	var conta1 ContaBancaria = ContaBancaria{500, "Titular1"}
	fmt.Printf("%2.2f \n", conta1.GetSaldo())
	conta1.Depositar(50)
	fmt.Printf("%2.2f \n", conta1.GetSaldo())
	conta1.Sacar(250)
	fmt.Printf("%2.2f \n", conta1.GetSaldo())

	//Question 4

	println("---Question 4---")

	var cachorro1 Cachorro = Cachorro{}
	var gato1 Gato = Gato{}

	cachorro1.Som()
	gato1.Som()

	//Question 5

	println("---Question 5---")

	animais := []Animal{
		&Cachorro{},
		&Gato{},
	}

	SomLista(animais)

	//Question 7

	println("---Question 7---")

	var escola1 Escola = Escola{nil}
	var escola2 Escola = Escola{nil}
	var professor1 Professor = Professor{}
	var professor2 Professor = Professor{}

	escola1.professor = append(escola1.professor, professor1)
	escola1.professor = append(escola1.professor, professor2)
	escola2.professor = append(escola2.professor, professor1)
	escola2.professor = append(escola2.professor, professor2)

	//Question 8

	println("---Question 8---")

	var empresa1 Empresa = Empresa{nil}

	var empregado1 Empregado = Empregado{"Nome1", "Cargo1", 1000.00}
	var empregado2 Empregado = Empregado{"Nome2", "Cargo2", 1250.00}
	var empregado3 Empregado = Empregado{"Nome3", "Cargo3", 850.00}

	empresa1.empregado = append(empresa1.empregado, empregado1)
	empresa1.empregado = append(empresa1.empregado, empregado2)
	empresa1.empregado = append(empresa1.empregado, empregado3)

	//Question 9

	println("---Question 9---")

	relatorio1 := Relatorio{}
	contrato := Contrato{}

	relatorio1.Imprimir()
	contrato.Imprimir()

	//Question 10

	println("---Question 10---")

	calculadora1 := Calculadora{}

	calculadora1.Soma2(2, 6)

	calculadora1.Soma3(12, 21, 7)

	//Question 11

	println("---Question 11---")

	funcionarioHorista1 := FuncionarioHorista{}
	funcionarioAssalariado1 := FuncionarioAssalariado{}

	funcionarioHorista1.CalcularSalario(10, 120)
	funcionarioAssalariado1.CalcularSalario(1200, 2)

	//Question 12

	println("---Question 12---")

	loja1 := Loja{}
	produto1 := Produto{2.99}
	produto2 := Produto{14.99}
	produto3 := Produto{5.25}

	loja1.SomarProduto(produto1, produto1, produto2, produto3)

	//Question 13

	println("---Question 13---")

	matematica1 := Matematica{}
	matematica1.Fatorial(3)
	matematica1.Fatorial(7)
	matematica1.Fatorial(0)
	matematica1.Fatorial(10)

	//Question 14

	println("---Question 14---")

	configuracao1 := GetInstance()
	configuracao1.valor = 1

	//Question 15

	println("---Question 15---")

	conta1.Sacar(350)
	fmt.Printf("%2.2f \n", conta1.GetSaldo())
}
