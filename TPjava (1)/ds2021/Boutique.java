package TPjava.ds2021;

public class Boutique {
    
    private vetement[] tabVet;
    private String nom;
    private int nbVet = 0 ;
    private  int taille ;
    
    public Boutique(String name,int taille ){
        tabVet = new vetement[taille];
        nom = name;
        this.taille = taille;
    }

    public void ajoutVetement(vetement v) {

        if (nbVet < taille) {
            tabVet[nbVet++] = v;
            System.out.println(nbVet);

        }else{
            System.out.println("<< Boutique Pleine >>");
        }
        
    }

    public void afficheStock(int remise) {
        for (int i = 0; i < nbVet; i++) {
            System.out.println("nom :" +nom +tabVet[i].toString());
        }
    }

}
