package TP_Exception;




class Factorielle
{ 
public static void main (String[] args) throws ExceptionGrand 
 {
 int i, nbEntiers=0, factorielle=1;
 int ancien;
 try {
     
     
     nbEntiers= Integer.parseInt(args[0]);
    //  nbEntiers= 21;
     if(nbEntiers<0) throw new EXceptionNegatif(nbEntiers);
     for (i=2;i<= nbEntiers;i++)
     {
         ancien=factorielle;
         if (nbEntiers >20) throw new ExceptionGrand(nbEntiers);
         factorielle *= i;
        }
        System.out.println(" Voila la factorielle des "+ nbEntiers +
        " premiers entiers : "+ factorielle );
    } catch (ArrayIndexOutOfBoundsException a) {
        System.out.println("Indiquez le nombre d'entiers sur la ligne de commande");
}catch(NumberFormatException a){
    System.out.println("L'argument doit être entier");
    
}catch(EXceptionNegatif e1){
    System.out.println(e1.message());

}catch(ExceptionGrand ee){
    System.out.println(ee.message());
}
 }}