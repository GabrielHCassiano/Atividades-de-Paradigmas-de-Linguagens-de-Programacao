package main

import (
	"fmt"
)

func main() {
	var numbers [6]int
	var sumEven int
	var countOdd int
	fmt.Println("Digite 6 números interios: ")

	for i := 0; i < 6; i++ {
		fmt.Scan(&numbers[i])
	}

	fmt.Print("Números pares digitados: ")
	for _, num := range numbers {
		if num%2 == 0 {
			fmt.Print(num, " ")
			sumEven += num
		}
	}
	fmt.Println()
	fmt.Println("Soma dos números pares: ", sumEven)
	fmt.Print("Números ímpares digitados: ")

	for _, num := range numbers {
		if num%2 != 0 {
			fmt.Print(num, " ")
			countOdd++
		}
	}

	fmt.Println()
	fmt.Println("Quantidade de números ímpares: ", countOdd)

}
