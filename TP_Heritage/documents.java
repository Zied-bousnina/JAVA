package TP_Heritage;

public class documents {
    
    protected String titre;
    protected int numero;
    protected int nbrPage;
    protected String type;


    public documents (String titre, int numero, int nbrPage, String type) {
        this.titre = titre;
        this.numero = numero;
        this.nbrPage = nbrPage;
        this.type = type;
    }


    public void edition() {
        System.out.println("TYpe :"+type+" \n\tTiter :"+titre+"\n\tNumero :"+numero+"\n\tnbr de Page :"+nbrPage);


    }

    public String getType() {
        return type;
    }
    


}
