
package TP2;

// import java.util.jar.Attributes.Name;

public class test_Point {
    public class Point {
        private String Nom;
        private int abscisse;
        private int ordonnée;

        public Point(int a, int b) {

            abscisse = a;
            ordonnée = b;
        }

        public Point(String Nom, int a, int b) {
            this.Nom = Nom;
            abscisse = a;
            ordonnée = b;
        }

        public Point(String ch) {

            Nom = ch;
        }

        public void Affiche() {
            System.out.println(Nom + "(" + abscisse + ", " + ordonnée + ")");

        }

        public void translHoriz(int a) {
            abscisse += a;

        }

        public void translVert(int a) {
            ordonnée += a;

        }

        public void translation(int a, int b) {
            abscisse += a;

            ordonnée += b;

        }

        public boolean coincide(Point p) {
            return this.abscisse == p.abscisse && this.ordonnée == p.ordonnée;

        }

        public String getNom() {
            return Nom;

        }

        public int getAbscisse() {
            return abscisse;

        }

        public int getOrdonnés() {
            return ordonnée;

        }

        public void setNom(String ch) {
            Nom = ch;

        }

        public void setAbscisse(int a) {
            abscisse = a;
        }

        public void setOrdonnee(int a) {
            ordonnée = a;

        }

    }

    public static void main(String[] args) {
        test_Point s = new test_Point();

        Point p1 = s.new Point(3, 5);
        Point p2 = s.new Point("a");
        Point p3 = s.new Point("b", 3, 5);
        System.out.println("\n ---------------------------\n");
        System.out.println("les Points créés sont :");
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();
        System.out.println("\n ---------------------------\n");
        if (p1.coincide(p3) == true)
            System.out.println("Les 2 Points p1 et p3 coïncident");
        else
            System.out.println("Les 2 Points ne coïncident pas");
        System.out.println("\n ---------------------------\n");
        System.out.println("translation des Point ");
        p1.translHoriz(4);
        p2.translVert(3);
        p3.translation(5, 2);
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();
        System.out.println("\n ---------------------------\n");
        System.out.println("modification des attributs des Points");
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnee(50);
        p1.Affiche();
        p2.Affiche();
        p3.Affiche();
        System.out.println("\n ---------------------------\n");
        System.out.println("utilisation des méthodes get");
        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnés();
        System.out.println(" le nom du Point p1 est : " + x);
        System.out.println(" son abscisse est : " + y);
        System.out.println(" son ordonnée est : " + z);


        System.out.println( System.identityHashCode(z));
        
    }

}
