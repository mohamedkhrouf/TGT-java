/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 


 
public class Personne {
     private int id=0;
     private String username;
     private String username_canonical;
     private String email;
     private String email_canonical;
     private int enabled;
     private String Salt;
     private String password;
     private Timestamp last_login;
     private String confirmation_token;
     private Timestamp password_requested_at;
     private String roles;
     

    public Personne(String username, String email, String password) {
       this.id=this.id +1;
        this.username = username;
        this.username_canonical = username;
        this.email = email;
        this.email_canonical = email;
        this.enabled = 1;
        this.Salt = "";
        this.password = password ;
      
       java.util.Date date = new Date();
        Timestamp last = new java.sql.Timestamp(date.getTime());
	 
        this.last_login = last;
        this.confirmation_token = username;
         Timestamp requested = new java.sql.Timestamp(date.getTime());
        this.password_requested_at = requested;
        this.roles = "a:1:{i:0;s:9:\"ROLE_USER\";}";
    }
  
    public String getEmail_canonical() {
        return email_canonical;
    }

    public void setEmail_canonical(String email_canonical) {
        this.email_canonical = email_canonical;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getConfirmation_token() {
        return confirmation_token;
    }

    public void setConfirmation_token(String confirmation_token) {
        this.confirmation_token = confirmation_token;
    }

    

  
    

    public int getId() {
        return id;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String Salt) {
        this.Salt = Salt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername_canonical() {
        return username_canonical;
    }

    public void setUsername_canonical(String username_canonical) {
        this.username_canonical = username_canonical;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getPassword_requested_at() {
        return password_requested_at;
    }

    public void setPassword_requested_at(Timestamp locked) {
        this.password_requested_at = locked;
    }

    @Override
    public String toString() {
       return "Personne : {" + "identifiant=" + this.id + ", nom=" + this.username + ", prenom=" + this.email+ '}'+ "\n"; 
    }

 

    

   
    
    
    

   
    
}
