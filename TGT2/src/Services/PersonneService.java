/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Personne;
import TGT.MyDbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersonneService {

   Connection connexion;
   

    public PersonneService() {
       connexion=MyDbConnection.getInstance().getConnexion();
    }

   public void ajouterPersonne(Personne p) throws SQLException {
        String requete="insert INTO fos_user(username,username_canonical,email,email_canonical,enabled,salt,password,last_login,confirmation_token,password_requested_at,roles) values (?,?,?,?,?,?,?,?,?,?,?)";
        
           
            PreparedStatement pst= connexion.prepareStatement(requete);
             pst.setString(1, p.getUsername());
             pst.setString(2, p.getUsername_canonical());
             pst.setString(3, p.getEmail());
             pst.setString(4, p.getEmail_canonical());
             pst.setInt(5, p.getEnabled());
             pst.setString(6, p.getSalt());
             pst.setString(7, p.getPassword());
             pst.setTimestamp(8, p.getLast_login());
             pst.setString(9, p.getConfirmation_token());
             pst.setTimestamp(10, p.getPassword_requested_at());
             pst.setString(11, p.getRoles());
  
            
          
             pst.executeUpdate();
            System.out.println("Insertion réussie");
                  System.out.println("Insertion réussie");
       
     
    }



    public List<Personne> getAllPersonnes() throws SQLException {
       List<Personne> personnes = new ArrayList<>();
        
        String req = "select * from fos_user";
        Statement stm = connexion.createStatement();
        ResultSet result =  stm.executeQuery(req);
        
        while(result.next()){
            Personne p = new Personne( result.getString("username"), result.getString("email"),result.getString("password"));
            personnes.add(p);
        }
        System.out.println("Afficher Personnes :");
        return personnes;
    }

}
