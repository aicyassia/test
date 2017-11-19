
package exo1;

public class Client {
    private int NumC;
    private String Nom;
    private String Adresse;
private String Caution;

public Client() {//constructeur de la classe 
    System.out.println("Création d'un objet client");     
    NumC=0;
    Nom="inconnu";
    Adresse="inconnu";
    Caution="inconnu";
    
}
//ajouter les getter 
    public int getNumC(){
        return NumC;}
    public String getNom(){
        return Nom;}
     public String getAdresse(){
        return Adresse ; }
      public String getCaution(){
        return Caution; }
    //ajouter les setteur 
      public void setNumC(int numC){
          this.NumC=numC; }
     public void setNom(String nom){
          this.Nom=nom; }
      public void setAd(String adresse){
          this.Adresse=adresse;}
       public void setCau(String caution){
          this.Caution=caution; 
       
       }
       
}
