/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.model;
import ibcs.dao.MembroTesteDAO;
import ibcs.database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Carmem
 */
public class TesteInsert {
    public static void main(String[] args){
        MembroTesteDAO dao = new MembroTesteDAO();
        dao.cadastrar(11, "Dona Ana", "dana@gmail.com");
        
    }
    
    public void listar(){
        String sql = "SELECT * FROM membroteste";
        
        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("");
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    

    
};



