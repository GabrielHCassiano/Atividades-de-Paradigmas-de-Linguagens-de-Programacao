package Java;

public class Matematica {
    
    public static void Fatoria(int valor) {

        int resultado = 1;

        for (int i = 1; i <= valor; i++)
            resultado *= i;

        System.out.println("Fatoria de " + valor +  ": " + resultado); 
    }
}
