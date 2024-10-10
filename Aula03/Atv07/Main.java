
package Atv07;

public class Main{

    public static void main(String[] args){

        int[] vetor = {5, 12, 7, 20, 15, 8, 3, 11, 6, 9};

        int soma = 0;
        int maiorValor = vetor[0];
        int menorValor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }

        double media = (double) soma / vetor.length;

        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);

    }
}