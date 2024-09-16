package main

import "fmt"

type Retangulo struct {
	comprimento, largula float64
}

func (r Retangulo) calcularArea() float64 {
	return r.comprimento * r.largula
}

func (r Retangulo) calcularPerimetro() float64 {
	return 2 * (r.comprimento + r.largula)
}

func main() {
	ret := Retangulo{comprimento: 200, largula: 300}
	fmt.Printf("Área: %.2f\n", ret.calcularArea())
	fmt.Printf("Perímetro: %.2f\n", ret.calcularPerimetro())
}
