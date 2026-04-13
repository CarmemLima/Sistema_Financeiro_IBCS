/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.dao;

import ibcs.database.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Carmem
 */
public class VendaDAO {
    public void salvar(int produtoId, int quantidade) {
        
        String sql = "INSERT INTO venda (produt0_id, quantidade) VALUES (?, ?)";
        
        try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, produtoId);
            stmt.setInt(2, quantidade);
            
            stmt.executeUpdate();
            
        }   catch (Exception e) {
            e.printStackTrace();
        }    
   
    }
    
}
