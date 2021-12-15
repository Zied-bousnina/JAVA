package TD2;

public class disqueDur extends disquette{
    private int nbSurface;

    public disqueDur() {
        
    }
    public disqueDur(char nomLog, double TailleSect, int nbSect, int nbPiste,int nbSurf) {
        super(nomLog, TailleSect, nbSect, nbPiste);
        nbSurface = nbSurf;

    }

    public double getEspaceDisque() {
        return (this.nbPiste * (this.nbSecteur * this.tailleSecteur)) * nbSurface;
        
    }

  

    // public disqueDur(){
    // super();
    // }

    
}

