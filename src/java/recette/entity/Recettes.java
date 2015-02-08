/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recette.entity;

import java.util.Date;
import java.util.logging.Logger;


/**
 *
 * @author Ghidhawi Dhekra
 */
public class Recettes {
    int id_recettes;
    String titre;
    String description;
    String date_publication;
   String date_modification;
     String photo;
    String type;
  

    
    public Recettes(int id_recettes, String titre, String description, String date_publication, String date_modification, String photo, String type) {
        this.id_recettes = id_recettes;
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        this.date_modification = date_modification;
        this.photo = photo;
        this.type = type;
    }

    public Recettes(String titre, String description, String date_publication, String date_modification) {
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        this.date_modification = date_modification;
    }

    public Recettes(int id_recettes) {
        this.id_recettes = id_recettes;
    }

   
    public int getId_recettes() {
        return id_recettes;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public String getDate_modification() {
        return date_modification;
    }

    public String getType() {
        return type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId_recettes(int id_recettes) {
        this.id_recettes = id_recettes;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }

    public void setDate_modification(String date_modification) {
        this.date_modification = date_modification;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void ajouterRecettes(Recettes recettes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
