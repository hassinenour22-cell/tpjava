import java.rmi.Remote;
import java.rmi.RemoteException;

public interface INotes extends Remote {

    double calcul_mg() throws RemoteException;
}