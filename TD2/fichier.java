package TD2;

public class fichier {
    private String name;
    private String extention;
    private String emplacement;
    private double taille;


    public fichier(String name, String extention, String emplacement, double taille) {
        this.name = name;
        this.extention = extention;
        this.emplacement = emplacement;
        this.taille = taille;

    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setExtention(String extention) {
        this.extention = extention;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }
    
    public String getName() {
        return this.name ;
    }
    
    public String getExtention() {
        return this.extention ;
    }

    public String getEmplacement() {
        return this.emplacement;
    }

    public double  getTaille() {
        return this.taille ;
    }
}
