package TP_Exception;

public class EXceptionNegatif extends Exception {
    public int number;
    
   public EXceptionNegatif(int a){
       
       number = a;

   }
   public  String message() {
       return (number +" est negatif : la factorielle n'est pas definie");
   }
}
