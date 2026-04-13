/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.main;



/**
 *
 * @author Carmem
 */


//import ibcs.dao.EventoDAO;
import ibcs.view.CadastroEvento;

/*public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema iniciado");

        EventoDAO dao = new EventoDAO();
        dao.salvar("Bazar Teste", "2026-03-20", "bazar");

    }
}*/


public class Main {
    public static void main(String[] args) {

        new CadastroEvento().setVisible(true);

    }
}