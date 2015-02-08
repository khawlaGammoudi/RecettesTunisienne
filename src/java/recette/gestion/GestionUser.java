/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recette.gestion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import recette.entity.utilisateur;
import recette.utile.*;
/**
 *
 * @author Ghidhawi Dhekra
 */
public class GestionUser {
    
  public static boolean existe(utilisateur U) throws ClassNotFoundException, SQLException{
      
      Statement st=Connecteur.getConnection();
      String rq="select * from utilisateur where login='"+U.getLogin()+"'and password='"+U.getPassword()+"'";
      ResultSet rs=st.executeQuery(rq);
      return rs.next();
      
  }

      public static String getType(utilisateur U) throws ClassNotFoundException, SQLException{
      Statement st=Connecteur.getConnection();
      String rq="select * from utilisateur where login='"+U.getLogin()+"'and password='"+U.getPassword()+"'";
      ResultSet rs=st.executeQuery(rq);
       rs.next();
       String Type=rs.getString(4);
     return Type; 
  }
   
}
