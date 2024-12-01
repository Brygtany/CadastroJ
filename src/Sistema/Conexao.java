/**
 * Codigo para descrever a conexão com o banco de dados
 * @author Brygtany Lima
 * @since 04/11/2024
 */

package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    static Connection con = null;
    // Configurações para conexão com MySQL
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/SISTEMA"; 
    static String usuario = "root"; 
    static String senha = "root"; 
    public static Connection obterConexao() {
        try {
            if (con == null) {
                // Carregar o driver do MySQL
                Class.forName(driver);
                // Conectar ao banco de dados
                con = DriverManager.getConnection(url, usuario, senha);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro de conexão com o banco de dados", e);
        }
        return con;
    }
    public static void main(String[] args) {
        // Testar conexão
        obterConexao();
        System.out.println("Conectado com sucesso");
    }
}
