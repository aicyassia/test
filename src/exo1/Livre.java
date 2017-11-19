
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
//ajouter les getter 
    public int getNumL(){
        return NumL;}
    public String getTitre(){
        return Titre; }
     public String getEdit(){
        return Editeur;}
      public String getAut(){
        return Auteur; }
      public int getdate(){
          return date[8]; }
      public String getetat(){
          return Etat; }
    //ajouter les setteur 
      public void setNumL(int numl){
          this.NumL=numl; }
     public void setTitre(String titre){
          this.Titre=titre; }
      public void setEd(String ed){
          this.Editeur=ed;}
       public void setAut(String aut){
          this.Auteur=aut;
      }
       public void setdate(int d[]){
           this.date=d;
       }
       public void setetat(String etat){
           this.Etat=etat;
           
       }
       public String toString(){
           return "Num du livre: " + this.NumL +
	  "  Titre du livre :  " + this.Titre +" Editeur du livre  " + this.Editeur + 
                   "Auteur du livre:" + this.Auteur + "la date de l'achat " +date[0]+date[1]+"/"
                   +date[2]+date[3]+"/"+date[4]+date[5]+date[6]+date[7] + "l'état du livre" +this.Etat
                   ;
           
           
}
       
       
}
