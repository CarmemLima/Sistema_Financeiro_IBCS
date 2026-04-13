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

public class EventoDAO {
    public void salvar(String nome, String data){
        
        String sql = "INSERT INTO evento (nome, data, tipo) VALUES (?, ?, ?)";
        
        try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nome);
            stmt.setString(2, data);
            stmt.setString(3, "evento");
            
            stmt.executeUpdate();
            
            System.out.println("Evento salvo no banco");
            
        } catch (Exception e){
                e.printStackTrace();
                }
        
          // System.out.println("Entrou no método salvar");
          // System.out.println("Nome': " + nome);
    }
    
    public void listar(){
        
    }
    
 
}
