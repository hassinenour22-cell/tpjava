import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class NotesImpl extends UnicastRemoteObject implements INotes {
    
    private List<Double> listeNotes;

    protected NotesImpl() throws RemoteException {
        super();
        listeNotes = new ArrayList<>();
        listeNotes.add(12.5);
        listeNotes.add(15.0);
    }

    @Override
    public synchronized double calcul_mg() throws RemoteException {
        if (listeNotes.isEmpty()) {
            return 0.0;
        }

        double somme = 0;
        for (double note : listeNotes) {
            somme += note;
        }
        
        return somme / listeNotes.size();
    }
}