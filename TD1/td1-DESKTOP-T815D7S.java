// package TD1;

// public class td1 {
    
//     public class livre{
        
//         private String titre, auteur;
//         private int nbPages;
//         private float prix;
//         private boolean prixFixe = false ;
    
//         public  livre(String unAuteur, String unTitre) {
//             auteur = unAuteur;
//             titre = unTitre;
            
//         }

//         public livre() {

//         }

//         public  livre(String unAuteur, String unTitre, int nb) {
//             auteur = unAuteur;
//             titre = unTitre;
//             nbPages = nb;
            
//         }
//         // prix
//         public livre(float pr) {
//             prix = pr;

//         }


//         // Accesseur
//         public String getAuteur() {
//             return auteur;
            
//         }

//         public String getTitre() {
//             return titre;
            
//         }

//         public int getNBPages() {
//             return nbPages;
            
//         }
//         public float getPrix() {
//             return prix;
//         }


//         public void afficheToi() {
//             System.out.println(toString());
//         }

//         public String toString() {
//             if (prix ==0) {
//                 return auteur+", "+ titre+ ", "+ nbPages+", Prix pas encore fixé";
                
//             }else 
//                return auteur+", "+ titre+ ", "+ nbPages+", "+ prix;
               
//         }




//         // modificateur

//         public void setNBpages(int a) {
//             if (a > 1) {
//                 nbPages = a;
//             }else {
//                 System.out.println("Le nombre de page doit etre positive!!");
//             }
            
//         }
//         public void setAuteur(String a) {
//             auteur = a;
            
//         }
//          public void setTitre(String T) {
//             titre = T;
            
//         }

//         public void setPrix(float pr) {
            
//             if (prix == 0) {
//                 prix = pr;
//                 prixFixe = true;
//             }else {
//                 System.out.println("le prix a deja modifier");
//             }
//         }
        



       
       
    
// }
// public class Mot_dict{
            
//     private String Mot;
//     private String definition;

//     // Etape 1

//     public String getMot()
//     {
//         return Mot;
//     }

//     public String getdefinition()
//     {
//         return definition;
//     }

//     public void setMot(String Mot)
//     {
//         this.Mot = Mot;
//     }

//     public void setDefinition(String def)
//     {
//         definition = def;
//     }

//     public  boolean synonyme(String ch){

//         return Mot == ch; 

//        }
       
       
       
//        // Etape 2
       
       
       
       
       
       
//    }
//    public class Dictionaire {
//     private String Nom;
//     private Mot_dict[] dict;
//     private int nb_mot ;
    
//     public Dictionaire(String nom, int nb_mot){
//         Nom = nom;
//         this.nb_mot = nb_mot;
        
//  }
 
//  public void Ajouter_Mot(Mot_dict m){
     
     
// }


// }
//     public static void main(String[] args)
//     {
        

//         td1 t1 = new td1();
        
//         // constructeur a deux parametre
//         livre l1 = t1.new livre("ZIED", "php");

//         // constructeur a 3 parametre
//         livre l2 = t1.new livre("x", "java", 300);
        
//         // constructeur sans param
//         livre l3 = t1.new livre();

//         l3.setAuteur("a");
//         l3.setTitre("Nothing");
//         l3.setNBpages(300);

        
//         l1.setNBpages(201);
//         l1.setPrix(1499);
//         l1.setPrix(19);
        

//         System.out.println("le nombre de pades de livre 1 : " +l1.getNBPages());
//         System.out.println("le nombre de pades de livre 2 : " +l2.getNBPages());
//         System.out.println("\n-----------------------------------------------------");
//         System.out.println("les nombres total des deux livre : " + (l2.getNBPages() + l1.getNBPages()));
//         l1.afficheToi();
//         l2.afficheToi();
//         l3.afficheToi();

//         // Mot_dict m = t1.new Mot_dict();
        
//         // m.setMot("zied");
//         // m.setDefinition("hello how are i'm fine thanks");
        
//         // System.out.println(m.synonyme("zied"));
        



        
//     }
    
// }




