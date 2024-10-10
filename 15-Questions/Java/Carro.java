package Java;

public class Carro {
    
    public String marca;
    public String modelo;
    public int ano;
    public double velocidade;
    public Motor motor;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;   
        this.velocidade = 0; 
        this.motor = null;
    }

    public void ExibirCarro() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public void Acelerar(double forca) {
        if(velocidade + forca > 120)
            velocidade = 120;
        else
            velocidade += forca;
    }

    public void Frear(double forca) {        
        if(velocidade - forca < 0)
            velocidade = 0;
        else
            velocidade -= forca;
    }

    public void VelocidadeAtual() {
        System.out.println("Velociade Atual: " + velocidade + " km/h");
    }

}
