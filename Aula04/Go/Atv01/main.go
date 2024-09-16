package main

import (
	"fmt"
)

type Animal struct {
	Nome    string
	Especie string
}

type Cachorro struct {
	Animal
}

type Gato struct {
	Animal
}

func Som() {}

func (m *Cachorro) Som() {
	fmt.Println("Au Au")
}

func (m *Gato) Som() {
	fmt.Println("Miau")
}

func main() {

	var cachorro Cachorro = Cachorro{Animal{"Bom dia", "Algum"}}
	var gato Gato = Gato{Animal{"Boa Noite", "Algum"}}

	cachorro.Som()
	gato.Som()

}
