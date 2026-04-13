/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibcs.model;
import ibcs.dao.MembroTesteDAO;

/**
 *
 * @author Carmem
 */
public class TesteUpdate {
    public static void main(String[] args){
        MembroTesteDAO dao = new MembroTesteDAO();
        dao.atualizar(11, "Ana", "ana@gmail.com");
    }
}
