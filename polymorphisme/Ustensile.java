package polymorphisme;
import java.time.LocalDate;

public abstract class Ustensile {
   protected int annee;
   

   public Ustensile(int a ){
       annee = a;
      
    
   }
   
   public int valeurTotal(){
    LocalDate d = LocalDate.now();
    int year = d.getYear();
    return annee<50 ? 0 : (year - annee -50);
}
   

    
}

