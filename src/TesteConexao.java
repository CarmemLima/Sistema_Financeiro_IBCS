/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carmem
 */
import java.sql.Connection;
import ibcs.database.ConexaoBD;

public class TesteConexao {

    public static void main(String[] args) {

        try {
            Connection conn = ConexaoBD.getConnection();
            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
} //package ibcs.main;




