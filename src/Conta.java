public abstract class Conta {
    protected double saldo;

    // Construtor
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para sacar dinheiro da conta
    public abstract void sacar(double valor);

    // Método para transferir dinheiro para outra conta do mesmo banco
    public abstract void transferir(double valor, Conta destino);
}