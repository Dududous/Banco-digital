public class Simulação {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco XYZ");

        // Adicionando clientes
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criando uma conta corrente para João
        ContaCorrente ccJoao = new ContaCorrente(1000, cliente1);
        ccJoao.depositar(200);
        ccJoao.sacar(50);

        // Criando uma conta poupança para Maria
        ContaPoupanca cpMaria = new ContaPoupanca(500, cliente2);
        cpMaria.depositar(300);
        cpMaria.sacar(100);

        // Transferindo dinheiro de João para Maria
        ccJoao.transferir(150, cpMaria);
    }
}
