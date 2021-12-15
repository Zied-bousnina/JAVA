package TD1;

public class EX6 {
    public class livre {
        private String titre;
        private String auteur;
        private String edition;
        private int nbre_page;
        

        public livre(String t, String a, String e, int n) {
            titre = t;
            auteur = a;
            edition = e;
            nbre_page = n;

        }
        public void affiche() {
            System.out.println(titre);
            System.out.println("<<Auteur :>>"+ auteur);
            System.out.println("<<Edition :>>"+edition);
        }
        public boolean compare(livre l) {
            return ((l.titre == titre) && (l.edition == edition) && (l.auteur == auteur) && (l.nbre_page == nbre_page));
        }

    }// fin class test1
    
    public class test1 {
    }
    public static void main(String[] args) {
        EX6 e = new EX6();
        // livre l1 = e.new livre("x", "y", "z", 900);
        livre l2 = e.new livre("x", "y", "z", 900);
        // livre l3 = e.new livre("x", "y", "z", 900);
        livre l4 = e.new livre("x", "y", "z", 900);
        if (l2.compare(l4)) 
            System.out.println("le meme livre");
        else 
           System.out.println("les 2 livre sont different");
        l2.titre ="programmer en java2";
        l2.affiche();
    }
    
}
