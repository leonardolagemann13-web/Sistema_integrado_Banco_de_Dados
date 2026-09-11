package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    // URL do banco
    private static final String URL =
            "jdbc:mysql://localhost:3306/cadastro_clientes";
    // Usuário MYSQL
    private static final String USER = "root";
    // Senha MYSQL
    private static final String PASSWORD = "";

    // Metodo de conexão
    public static Connection getConnection(){
        try {
            // Retorna a conexão
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (SQLException erro){
            // Exibe o erro
            throw new RuntimeException("Erro de conexão ao banco: " + erro);
        }
    }
}
