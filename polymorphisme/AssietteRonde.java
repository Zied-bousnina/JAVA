package polymorphisme;

public class AssietteRonde extends Assiette {
    private double rayon;
    
    public AssietteRonde(int a, double r){
        super(a);
        rayon = r;

    }
     @Override
    public  double  calculerSuraface(){
        return Math.PI * rayon *rayon;

    };
    

}
