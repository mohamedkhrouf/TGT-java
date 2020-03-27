/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TGT;

//import view.PersonneService;
import Services.PersonneService;
import Entities.Personne;

import java.sql.SQLException;


public class TGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Personne p = new Personne("Test", "test@gmail.com","test");
        PersonneService ps = new PersonneService();
       
        System.out.println(ps.getAllPersonnes());
        
        ps.ajouterPersonne(p);

       
        
    }

}
