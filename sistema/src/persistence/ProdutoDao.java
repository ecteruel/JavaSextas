package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProdutoDao {
    //Fazer a conexão com o BD
    private Connection conecta;
    //Executar comandos SQL (INSERT, DELETE, SELECT)
    private PreparedStatement st; 
    
    //Construtor vazio
    public ProdutoDao(){
        
    }
    
    //Fazer a conexõa com o Banco de dados
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "teruel");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    
}
