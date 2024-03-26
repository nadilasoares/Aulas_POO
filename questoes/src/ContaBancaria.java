public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João");
        System.out.println("Saldo inicial: " + conta.getSaldo());

        conta.depositar(1000);
        System.out.println("Saldo após depósito de 1000: " + conta.getSaldo());

        conta.sacar(500);
        System.out.println("Saldo após saque de 500: " + conta.getSaldo());
    }
}
