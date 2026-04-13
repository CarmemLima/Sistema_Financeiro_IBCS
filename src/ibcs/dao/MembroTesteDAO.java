/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.dao;

/**
 *
 * @author Carmem
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import ibcs.database.ConexaoBD;

//Classes de integração com o banco de dados MySQL.
public class MembroTesteDAO {
    
    //Classe para cadastrar dados no banco
    public void cadastrar(int id, String nome, String email) {
        String sql = "INSERT INTO membroteste (nome, email) VALUES (?, ?)";
        
        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString (1, nome);
            stmt.setString(2, email);
            
            stmt.execute();
            stmt.close();
            conn.close();
            
            System.out.println("Membro cadastrado com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    //Classe para atualizar dados no banco
    public void atualizar (int id, String nome, String email){
        String sql = "UPDATE membroteste SET nome = ?, email = ? WHERE id = ?";
            
        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            conn.close();
            
            System.out.println("Membro atualizado com sucesso!");
                        
        } catch (Exception e){
            throw new RuntimeException(e);
        }
                
            }
    
    //Classe para deletar dados no banco
    public static void deletar (int id){
        String sql = "DELETE FROM membroteste WHERE id = ?";
        
        try {
            Connection conn = ConexaoBD.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            conn.close();
            
            System.out.println("Membro deletado com sucesso!");
       
        } catch (Exception e){
            throw new RuntimeException(e);
            
        }
}
    
}



