package main

import (
	"fmt"
)

type Animal struct {
	Nome string
}

type Mamifero struct {
	Animal
}

type Ave struct {
	Animal
}

type Morcego struct {
	Mamifero
	Ave
}

func Som() {}

func (m *Mamifero) Amamentar() {
	fmt.Println(m.Nome, "está amamentando.")
}

func (m *Ave) Voar() {
	fmt.Println(m.Nome, "está voando.")
}

func (m *Morcego) Som() {
	fmt.Println("Morcego fazendo ruídos noturnos.")
}

func main() {

	var animal Animal = Animal{"Batman"}
	var morcego Morcego = Morcego{Mamifero{animal}, Ave{animal}}

	morcego.Som()
	morcego.Amamentar()
	morcego.Voar()

}
