package TD2;

public class disquette {

    protected char nomLogique;
    protected double tailleSecteur;
    protected int nbSecteur;
    protected  int nbPiste;
    protected fichier[] tab1 ;
    protected int[] tab2;
    protected int nb;
    static double espacefichier;

    public disquette(){

    }

    public disquette(char nomLog, double TailleSect, int nbSect, int nbPiste) {
        tab1 = new fichier[100];
        nomLogique = nomLog;
        tailleSecteur = TailleSect;
        nbSecteur = nbSect;
        this.nbPiste = nbPiste;
   
    }

    public double getEspaceDisque() {
        return this.nbPiste * (this.nbSecteur * this.tailleSecteur);
    }

    


    public double getEspaceLibre(){
        if (nb ==0) {
            return 0;
        }
       
    return (getEspaceDisque() - espacefichier);
    }

    public void AjouterFichier(String nom, String extention, String emplacement, double taille) {
        // nb++;

      if (this.getEspaceLibre() + taille <= this.getEspaceDisque()) {
          tab1[nb] = new fichier(nom, extention, emplacement, taille);
           espacefichier+= taille;
          tab2[nb] = System.identityHashCode(tab1[nb]);
          nb++;
          
      }else{
          System.out.println("espace stockage sature");
      }
    }

    public void explorerExtention(String extention) {
        for (int i = 0; i < nb; i++) {
           if (tab1[i].getExtention().compareTo(extention) ==0) {
               System.out.println("Nom :"+tab1[i].getName());
               System.out.println("\nExtention :"+tab1[i].getExtention());
               System.out.println("\nEmplacement  :"+tab1[i].getEmplacement());
               System.out.println("\nTaille  :"+tab1[i].getTaille());
           } 
        }

    }





     
}
