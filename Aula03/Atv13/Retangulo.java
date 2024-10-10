package Atv13;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(200, 300);
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}