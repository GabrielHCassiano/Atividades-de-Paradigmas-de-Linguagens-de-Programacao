public class Main {
    public static void main(String[] args)
    {

        //Atv01
        System.out.println("    ---Atv01---");
        Cachorro cachorro = new Cachorro("Algum", "Bom dia");
        System.out.println(cachorro.emitirSom());
        Gato gato = new Gato("2", ":v");
        System.out.println(gato.emitirSom());
        System.out.println();

        //Atv02
        System.out.println("    ---Atv02---");
        Morcego morcego = new Morcego("Algum", "Bat");
        System.out.println(morcego.emitirSom());
        System.out.println(morcego.amamentar());
        System.out.println(morcego.voar());
        System.out.println();

        //Atv03
        System.out.println("    ---Atv03---");
        Endereco endereco1 = new Endereco("Av. Principal", "Cidade A", "EStado X", "12345-678");
        Pessoa pessoa1 = new Pessoa("João", 30);
        pessoa1.adicionar_endereco(endereco1);
        pessoa1.mostrar_informacoes();

        Endereco endereco2 = new Endereco("Rua Secundária", "Cidade B", "EStado Y", "98765-432");
        Pessoa pessoa2 = new Pessoa("Maria", 25);
        pessoa2.adicionar_endereco(endereco2);
        pessoa2.mostrar_informacoes();

        Empresa empresa = new Empresa("ABC", "12345678901234");
        empresa.constratar_funcionario(pessoa1);
        empresa.constratar_funcionario(pessoa2);

        empresa.listar_funcionarios();
        System.out.println();

        //Atv04
        System.out.println("    ---Atv04---");
        Carro carro = new Carro("Toyota", "Corolla");
        carro.ligar();

        Pneu novo_pneu = new Pneu("Michelin", 17);
        carro.trocar_pneu(2, novo_pneu);
        carro.desligar();
        System.out.println();

    }
}