public class ContaPoupanca extends Conta {
    private static final double TAXA_SAQUE = 0.02; // Taxa de saque específica para conta poupança
    private Cliente cliente;

    // Construtor
    public ContaPoupanca(double saldoInicial, Cliente cliente) {
        super(saldoInicial);
        this.cliente = cliente;
    }

    // Implementação do método sacar para uma conta poupança
    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor * (1 + TAXA_SAQUE);
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Implementação do método transferir para uma conta poupança
    @Override
    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
