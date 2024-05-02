import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InventoryManager extends Remote{
    void registrarLibro(Libro libro) throws RemoteException;
    List<Libro> inventoryConsult() throws RemoteException;
}