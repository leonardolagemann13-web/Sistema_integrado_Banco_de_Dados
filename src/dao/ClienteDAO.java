package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;

import connection.ConnectionFactory;
import model.Cliente;
public class ClienteDAO {
    // Metodo salvar
    public void salvar(Cliente cliente){
        String sql =
                "INSERT INTO clientes("
                +"nome, "
                +"sobrenome, "
                +"idade, "
                +"telefone, "
                +"email, "
                +"cpf, "
                +"rg, "
                +"endereco, "
                +"cidade, "
                +"estado " // Erro nesa parte, tinha que remover a virgula pra funcionar
                +") VALUES(?,?,?,?,?,?,?,?,?,?)";
        try (
                // Abre conexão
                Connection conexao = ConnectionFactory.getConnection();
                // Prepara o SQL
                PreparedStatement stmt = conexao.prepareStatement(sql)
        ){
            stmt.setString(1, cliente.getNome());
            stmt.setString(2,cliente.getSobrenome());
            stmt.setInt(3,cliente.getIdade());
            stmt.setString(4,cliente.getTelefone());
            stmt.setString(5,cliente.getEmail());
            stmt.setString(6,cliente.getCpf());
            stmt.setString(7,cliente.getRg());
            stmt.setString(8,cliente.getEndereco());
            stmt.setString(9,cliente.getCidade());
            stmt.setString(10,cliente.getEstado());

            // Executa o insert
            stmt.execute();
            // Exibe no console
            System.out.println("Cliente salvo com sucesso!");
        }catch (Exception erro){
            System.out.println("Erro ao salvar cliente: " + erro);
        }
    }
}
