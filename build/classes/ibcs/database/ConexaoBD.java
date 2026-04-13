/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.database;


/**
 *
 * @author Carmem
 */
import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBD {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/igreja_bd";
        String user = "root";
        String password = "Memr@c14";
        
        return DriverManager.getConnection(url, user, password);
    }
}

//Connection conn = ConexaoBD.getConnection();
//System.out.println("Conectado");
