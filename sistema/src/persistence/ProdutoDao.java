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
    
   //Método para Salvar os dados na tabela do BD
    public int salvar(Produto prod) {
        try {
            st = conecta.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, prod.getCodigo());
            st.setString(2, prod.getNome());
            st.setString(3, prod.getMarca());
            st.setDouble(4, prod.getPreco());
            st.executeUpdate(); //Executa o INSERT
            return 1;
        } catch (SQLException ex) {
            if(ex.getErrorCode()==1062){ //tentativa de cadastrar código já existente
               return 1062;                
            } else {
               return 0;
            }
        }
   }
    
   //Método para Excluir dados da tabela do banco de dados
    
   //Método para Consultar os dados da tabela do Banco de dados

   //Método para Alterar os dados da tabela
    
}
