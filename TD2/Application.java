package TD2;
// import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        // Scanner s =new Scanner(System.in);
        // disquette d1 = new disquette();
        disqueDur dure1 = new disqueDur('C', 0.9375, 520, 1024, 16); 
        dure1.AjouterFichier("Examen", "doc", "C:\\word", 2);
        dure1.AjouterFichier("Bulletin", "xls", "C:\\exel", 2);
        dure1.AjouterFichier("nature", "gif", "C:", 25);
        System.out.println(dure1.getEspaceLibre());
        System.out.println(dure1.getEspaceDisque());
        
        dure1.explorerExtention("doc");
         
        
      
        
        
        
        // int choix = 0;
        // do {
        //     System.out.println("1:ajouter disque dur\n");
        //     System.out.println("2:ajouter fichier\n");
        //     choix = s.nextInt();
        //     switch (choix) {
        //         case 1:
        //         System.out.println("Nom Logique : ");
        //         String nom = s.next();
                
        //         System.out.println("\nTaille Secteur : ");
        //         Double taille = s.nextDouble();
                
        //         System.out.println("\nNombre Surface : ");
        //         int nbrSurface = s.nextInt();
                
        //         System.out.println("\nNombre de piste par Surface : ");
        //         int nbrPiste = s.nextInt();
                
        //         System.out.println("\nNombre de secteurs par Pistes : ");
        //         int nbrSecteur = s.nextInt();
                
        //         // disqueDur dur1 = new disqueDur();
        //         // disqueDur dure1 = new disqueDur(nom, taille, nbrSecteur, nbrPiste, nbrSurface); 
               
                     

                    
        //             break;
        //         case 2 :
        //            System.out.println("Nom Fichier :");
        //            String nomFich = s.next();

        //            System.out.println("Extention :");
        //            String extention = s.next();

        //            System.out.println("Emplacement :");
        //            String emplacement = s.next();

        //            System.out.println("taille :");
        //            int tailleFich = s.nextInt();

        //            dure1.AjouterFichier(nomFich, extention, emplacement, tailleFich);
        //         //    dure1.tab1[dure1.tab1.length].AjouterFichier();





        //         default:
        //             break;
        //     }
        // } while (choix ==1);
    }
    
}
