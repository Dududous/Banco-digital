import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    // Construtor
    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    // Método para adicionar cliente ao banco
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para buscar cliente pelo CPF
    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }
}
