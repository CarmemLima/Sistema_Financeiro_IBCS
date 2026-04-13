/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.dao;

import ibcs.database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Carmem
 */

public class EventoDAO {
    public void salvar(String nome, String data, String tipo){
        
        String sql = "INSERT INTO evento (nome, data, tipo) VALUES (?, ?, ?)";
        
        try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setString(2, data);
            stmt.setString(3, tipo);
            
            stmt.executeUpdate();
            
            System.out.println("Evento salvo no banco");
            
        } catch (Exception e){
                e.printStackTrace();
                }
        
      
    }
    
    public double calcularTotal(){
        
        String sql = "SELECT SUM(p.preco * v.quantidade) AS total" +
         "FROM venda v JOIN produto p ON v.produto_id = p.id";
      
        try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {
            
            if (rs.next()) {
                return rs.getDouble("total");
                
            }
        } catch (Exception e){
                e.printStackTrace();
                }
        
        return 0;
    }
        
    
    //public void listar(){}
        
    
    
    
 
}
