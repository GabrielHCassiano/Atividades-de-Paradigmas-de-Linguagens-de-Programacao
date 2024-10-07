
public class Main {
    public static void main(String[] args)
    {
        //Question 1

        System.out.println("        ---Question 1---");

        Carro carro1 = new Carro("Marca1", "Modelo1", 2007);
        carro1.ExibirCarro();
        Carro carro2 = new Carro("Marca2", "Modelo2", 2015);
        carro2.ExibirCarro();
        Carro carro3 = new Carro("Marca3", "Modelo3", 2004);
        carro3.ExibirCarro();
        System.out.println();


        //Question 2

        System.out.println("        ---Question 2---");
        carro1.Acelerar(20);
        carro1.VelocidadeAtual();
        carro1.Frear(25);
        carro1.VelocidadeAtual();
        System.out.println();

        //Question 3

        System.out.println("        ---Question 3---");
        ContaBancaria conta1 = new ContaBancaria(500, "Titular1");
        System.out.println(conta1.GetSaldo());
        conta1.Depositar(50);
        System.out.println(conta1.GetSaldo());
        conta1.Sacar(250);
        System.out.println(conta1.GetSaldo());
        System.out.println();

        //Question 4

        System.out.println("        ---Question 4---");
        Cachorro cachorro1 = new Cachorro("Nome1");
        cachorro1.Som();
        Gato gato1 = new Gato("Nome2");
        gato1.Som();
        System.out.println();

        //Question 5

        System.out.println("        ---Question 5---");
        Animal[] animais = {cachorro1, gato1};
        Animal.SonsAnimais(animais);
        System.out.println();

        //Question 6

        System.out.println("        ---Question 6---");
        Motor motor1 = new Motor();
        carro1.motor = motor1;
        System.out.println();

        //Question 7

        System.out.println("        ---Question 7---");
        Escola escola1 = new Escola();
        Escola escola2 = new Escola();
        Professor professor1 = new Professor();
        Professor professor2 = new Professor();
        escola1.professores.add(professor1);
        escola1.professores.add(professor2);
        escola2.professores.add(professor1);
        escola2.professores.add(professor2);
        System.out.println();

        //Question 8

        System.out.println("        ---Question 8---");
        Empresa empresa1 = new Empresa();
        Empregado empregado1 = new Empregado("Nome1", "Cargo1", 1000.00);
        Empregado empregado2 = new Empregado("Nome2", "Cargo2", 1250.00);
        Empregado empregado3 = new Empregado("Nome3", "Cargo3", 850.00);

        empresa1.empregados.add(empregado1);
        empresa1.empregados.add(empregado2);
        empresa1.empregados.add(empregado3);

        System.out.println();

        //Question 9

        System.out.println("        ---Question 9---");
        Relatorio relatorio1 = new Relatorio();
        Contrato contrato1 = new Contrato();
        relatorio1.Imprimmir();
        contrato1.Imprimmir();
        System.out.println();

        //Question 10

        System.out.println("        ---Question 10---");
        Calculadora calculadora1 = new Calculadora();
        calculadora1.Somar(5, 7);
        calculadora1.Somar(12, 7, 20);
        System.out.println();

        //Question 11

        System.out.println("        ---Question 11---");
        FuncionarioHorista funcionario1 = new FuncionarioHorista();
        FuncionarioAssalariado funcionario2 = new FuncionarioAssalariado();
        funcionario1.CalcularSalario(120, 10);
        funcionario2.CalcularSalario(2, 1200.00);
        System.out.println();

        //Question 12

        System.out.println("        ---Question 12---");
        Loja loja1 = new Loja();
        Produto produto1 = new Produto(2.99);
        Produto produto2 = new Produto(14.99);
        Produto produto3 = new Produto(5.25);
        loja1.SomarProdutor(produto1, produto1, produto2, produto3);
        System.out.println();

        //Question 13

        System.out.println("        ---Question 13---");
        Matematica matematica1 = new Matematica();
        matematica1.Fatoria(3);
        matematica1.Fatoria(7);
        matematica1.Fatoria(0);
        matematica1.Fatoria(10);
        System.out.println();

        //Question 14

        System.out.println("        ---Question 14---");
        Configuracao.getInstancia();
        System.out.println();

        //Question 15

        System.out.println("        ---Question 15---");
        conta1.Sacar(350);
        System.out.println(conta1.GetSaldo());
        System.out.println();

    }
}
