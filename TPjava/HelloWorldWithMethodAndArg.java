package TPjava;

public class HelloWorldWithMethodAndArg {
    public void hello(String arg){
        System.out.println(arg);
    }
    public static void main(String[] args){
        HelloWorldWithMethodAndArg s = new HelloWorldWithMethodAndArg();
        s.hello("Bonjour");
    }
    
}
