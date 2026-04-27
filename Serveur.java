import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur {
    public static void main(String[] args) {
        try {
            
            NotesImpl objetDistant = new NotesImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("ServiceNotes", objetDistant);

            System.out.println("Serveur prêt et en attente de clients...");
        } catch (Exception e) {
            System.err.println("Erreur Serveur : " + e.getMessage());
            e.printStackTrace();
        }
    }
}