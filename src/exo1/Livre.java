
package exo1;
public class Livre {
     private int NumL;
    private String Titre;
    private String Editeur;
private String Auteur;
private int date[];
private String Etat;
public Livre() {//constructeur de la classe 
    System.out.println("Création d'un objet Livre");     
    NumL=0;
    Titre="inconnu";
    Editeur="inconnu";
    Auteur="inconnu";
    int date[]=new int[8];
    Etat="inconnu";   
}    
}
