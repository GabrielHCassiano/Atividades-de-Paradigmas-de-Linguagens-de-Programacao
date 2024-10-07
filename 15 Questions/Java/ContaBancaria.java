public class ContaBancaria {
    
    private double saldo;
    public String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double GetSaldo() {
        return saldo;
    }

    public void Depositar(double saldo) {
        this.saldo += saldo;
    }

    public void Sacar(double saldo) {
        try {
            if (this.saldo - saldo >= 0)
                this.saldo -= saldo;
            else
                throw new SaldoInsuficienteException("Error, saldo insuficiente");
        } catch(SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

}
