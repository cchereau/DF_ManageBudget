/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://openclassrooms.com/fr/courses/1766341-structurez-vos-donnees-avec-xml/1768662-dom-exemple-dutilisation-en-java 
*/
package df_class;

import java.sql.Date;

/**
 *
 * @author chris
 */
public class Ressource 
{
    String UID;
    String nom;
    String prenom;
    String typeContrat;
    String Societe;
    Double tjm;
    Date datEntree;
    Date datFin;

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public String getSociete() {
        return Societe;
    }

    public void setSociete(String Societe) {
        this.Societe = Societe;
    }

    public Double getTjm() {
        return tjm;
    }

    public void setTjm(Double tjm) {
        this.tjm = tjm;
    }

    public Date getDatEntree() {
        return datEntree;
    }

    public void setDatEntree(Date datEntree) {
        this.datEntree = datEntree;
    }

    public Date getDatFin() {
        return datFin;
    }

    public void setDatFin(Date datFin) {
        this.datFin = datFin;
    }


    
}
