package main

import (
	"fmt"
)

type Motor struct {
	Tipo     string
	Potencia int
}

type Pneu struct {
	Marca   string
	Tamanho int
}

type Carro struct {
	Marca  string
	Modelo string
	Motor  Motor
	Pneus  [4]Pneu
}

func (Motor *Motor) Ligar() {
	fmt.Println("O motor está ligado.")
}

func (Motor *Motor) Desligar() {
	fmt.Println("O motor está desligando.")
}

func (Pneu *Pneu) Inflar() {
	fmt.Println("O pneu está inflado.")
}

func (Pneu *Pneu) Desinflar() {
	fmt.Println("O pneu está desinflado.")
}

func (Carro *Carro) Ligar() {
	fmt.Println("O carro está pronto para rodar.")
}

func (Carro *Carro) Desligar() {
	fmt.Println("O carro foi desligado.")
}

func (Carro *Carro) Trocar_pneu(indice int, novo_pneu Pneu) {
	Carro.Pneus[indice] = novo_pneu
	fmt.Println("Pneu", (indice + 1), "trocado.")
}

func main() {

	pneus := [4]Pneu{{"Pirelli", 18}, {"Pirelli", 18}, {"Pirelli", 18}, {"Pirelli", 18}}

	carro := Carro{"Toyota", "Corolla", Motor{"Gasolina", 150}, pneus}
	carro.Ligar()

	novo_pneu := Pneu{"Michelin", 17}
	carro.Trocar_pneu(2, novo_pneu)
	carro.Desligar()

}
