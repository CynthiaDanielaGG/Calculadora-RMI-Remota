import java.rmi.Naming;

public class CalculadoraServidor {
    public CalculadoraServidor(){
        try{
            CalculadoraInterface c = new CalculadoraImpl();
            Naming.rebind("rmi://192.168.43.74/CalculadoraImpl", c);
        }catch(Exception e){
            System.out.println("Error encontrado: "+ e);
        }
    }
    public static void main(String args[]){
        new CalculadoraServidor();
    }
}
