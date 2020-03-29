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
        PersonneService ps = new PersonneService();
        Personne p = new Personne("med", "medk@gmail.com","test");
        
        System.out.println(ps.getAllPersonnes());
        
        //ps.ajouterPersonne(p);
       // ps.supprimerPersonne(p.getId());
      // ps.modifierPersonne(p.getId(),"medk","test");
       ps.modifierMdpPersonne(p,"lol");
        ps.checkLog("medk","lol" );
    }

}
