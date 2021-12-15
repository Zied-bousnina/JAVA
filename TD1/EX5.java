package TD1;
import java.lang.Math;

public class EX5 {

    public class point {
        private int abs;
        private int ord;

        public point() {
            abs = 0;
            ord = 0;
        }

        public point(int a, int o) {
            abs = a;
            ord = o;

        }
        public int getAbs() {
            return abs;
        }

        public int getOrd() {
            return ord;
        }
        
    } // end class point
    
    public class cercle {
        private point centre;
        private double rayon;
        private double epaisseur;
        
        public cercle() {
            rayon = 0;
            epaisseur = 0;

        }

        public  cercle(int a, int o, double rayon, double epaisseur) {
           
            centre = new point(a,o);
            
            this.rayon = rayon;
            this.epaisseur = epaisseur;
        }

        //Method surface poiur calculer la surface d'un cercle 
        public double surface() {
            return (rayon*rayon) * Math.PI; // PI = 3.14
        }

        public double getRayon() {
            return rayon;
        }

        public double getEpaisseur() {
            return epaisseur;
        }

        public int getAbsCentre() {
            return centre.abs;
        }

        public int getAbsOrd() {
            return centre.ord;
        }

        public boolean egale(cercle c1, cercle c2) {
            return c1.surface() == c2.surface();
        }

    }

    public static void main(String[] args) {

        EX5 e1 = new EX5();
        // point p = e1.new point(3,5);

        cercle c1 = e1.new cercle(4, 5, 2.3, 2.5);
        cercle c2 = e1.new cercle(4, 5, 12, 2);
        
        System.out.println(c1.getEpaisseur());
        System.out.println(c2.getEpaisseur());

        System.out.println(c1.egale(c1, c2));

    }
}
