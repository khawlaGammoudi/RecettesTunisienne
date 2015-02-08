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
import recette.entity.Recettes;
import recette.utile.Connecteur;

/**
 *
 * @author Ghidhawi Dhekra
 */
public class GestionRecettes {
    
    
    public static ArrayList<Recettes> getAllRecettes() throws SQLException, ClassNotFoundException{
 
       
            ArrayList<Recettes> L=new ArrayList<>();
            Statement st=Connecteur.getConnection();
            String rq="select * from recette";
            ResultSet rs=st.executeQuery(rq);
            while(rs.next())
            {
                Recettes R=(new Recettes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
                L.add(R);
            }  
            return L;  
    }

    public static ArrayList<Recettes>getRecettes(int id_recettes) throws SQLException, ClassNotFoundException{
        ArrayList<Recettes> liste=new ArrayList<Recettes>();
       Statement st=Connecteur.getConnection();
        String rq="select * from recette where id_recettes ="+id_recettes;
        ResultSet rs=st.executeQuery(rq);
        while(rs.next()) 
        {
            Recettes d=new Recettes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
            liste.add(d);
        }
        return liste;
    }
    
    /****** modification des recettes *****/
    public static void modifierRecettes(int id_recettes,String date_modification) throws ClassNotFoundException, SQLException{
      Statement st=Connecteur.getConnection();
        String rq="update recette set date_modification='" +date_modification+"'where id_recettes="+id_recettes;
          st.executeUpdate(rq);
    }
    /***** ajouter recettes******/
 public static void ajouterRecettes(int id_recettes,String titre,String description,String date_publication, String photo,String type) throws SQLException, ClassNotFoundException
    {
       Statement st=Connecteur.getConnection();
        String rq="insert into recette(id_recettes,titre,description, date_publication,date_modification,photo,type)values"
                + "("+id_recettes+",'"+titre+"','"+description+"','"+date_publication+"','"+"0000-00-00"+"','"+photo+"','"+type+"' )";
        st.executeUpdate(rq);
    }
public static void supprimerRecettes(int id_recettes) throws SQLException, ClassNotFoundException
    {
       Statement st=Connecteur.getConnection();
        String rq="delete from recette where id_recettes="+id_recettes;
        st.executeUpdate(rq);
    }

    
}
