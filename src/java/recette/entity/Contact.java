/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recette.entity;

/**
 *
 * @author Ghidhawi Dhekra
 */
public class Contact {
    String email;
    String sujet;
    String message;

    public Contact( String email, String sujet, String message) {
        this.email = email;
        this.sujet = sujet;
        this.message = message;
        
    }
    
   
    public String getEmail() {
        return email;
    }

    public String getSujet() {
        return sujet;
    }

    public String getMessage() {
        return message;
    }

   
    

   

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
   
}
