import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class LibraryServer extends UnicastRemoteObject implements InventoryManager{
    
    
    private List<Libro> inventory;
    public LibraryServer() throws RemoteException {
        inventory = new ArrayList<>();
    }

    @Override
    public void registerBook(Libro libro) throws RemoteException {

    }

    @Override
    public List<Libro> inventoryConsult() throws RemoteException {
        return inventory;
    }
}