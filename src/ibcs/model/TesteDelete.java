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
public class TesteDelete {
    public static void main(String[] args){
        MembroTesteDAO dao = new MembroTesteDAO();
        dao.deletar(7);
    }
    
}
