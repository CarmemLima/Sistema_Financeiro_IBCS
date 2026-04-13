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
public class ProdutoDAO {
    public void salvar(String nome, double preco) {
        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
        
        try (Connection conn = ConexaoBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setDouble(2, preco);
            
            stmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
