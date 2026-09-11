package controller;
import dao.ClienteDAO;
import model.Cliente;
public class ClienteController {
    // Metodo cadastrar
    public void cadastrarCliente(
            String nome,
            String sobrenome,
            int idade,
            String telefone,
            String email,
            String cpf,
            String rg,
            String endereco,
            String cidade,
            String estado
    ){
        // Cria o objeto cliente
        Cliente cliente = new Cliente(
                nome,
                sobrenome,
                idade,
                telefone,
                email,
                cpf,
                rg,
                endereco,
                cidade,
                estado
        );
        ClienteDAO dao = new ClienteDAO();
        dao.salvar(cliente);
    }
}
