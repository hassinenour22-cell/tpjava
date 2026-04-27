import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            INotes stub = (INotes) registry.lookup("ServiceNotes");

            System.out.println("--- Test du Service de Notes ---");
            double moyenne = stub.calcul_mg();
            
            System.out.println("La moyenne générale calculée par le serveur est : " + moyenne);

        } catch (Exception e) {
            System.err.println("Erreur Client : " + e.toString());
            e.printStackTrace();
        }
    }
}