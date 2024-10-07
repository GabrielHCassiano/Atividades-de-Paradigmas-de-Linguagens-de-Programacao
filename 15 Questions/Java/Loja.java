public class Loja {
    
    public double resultado;

    public void SomarProdutor(Produto... produto) {
        for (int i = 0; i < produto.length; i++)
            resultado += produto[i].valor;
        
        System.out.println("Resultado da compra: " + resultado);
    }

}
