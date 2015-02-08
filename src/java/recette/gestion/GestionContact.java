/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recette.gestion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import recette.entity.Contact;
import recette.utile.Connecteur;

/**
 *
 * @author Ghidhawi Dhekra
 */
public class GestionContact {
    
    
 public static void envoieContact(String email,String sujet,String message) throws SQLException, ClassNotFoundException
    {
        Statement st=Connecteur.getConnection();
        String rq="insert into contact(email,sujet, message)values('"+email+"','"+sujet+"','"+message+"')";
        st.executeUpdate(rq);
    }
 


public static ArrayList<Contact> getMessages() throws SQLException, ClassNotFoundException{
 
       
            ArrayList<Contact> L=new ArrayList<>();
            Statement st=Connecteur.getConnection();
            String rq="select * from contact";
            ResultSet rs=st.executeQuery(rq);
            while(rs.next())
            {
                Contact C=(new Contact(rs.getString(1),rs.getString(2),rs.getString(3)));
                L.add(C);
            }  
            return L;  
    }
}

    
