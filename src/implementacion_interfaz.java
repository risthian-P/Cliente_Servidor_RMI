import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class implementacion_interfaz extends UnicastRemoteObject implements interfaz{

    //constructor
    public implementacion_interfaz () throws RemoteException {
        super();
    }

    //implementar los metodos indicados eb la interfaz
    @Override
    public String mensaje() throws RemoteException {
        return "Hola desde el servidor";
    }

    @Override
    public double suma(double a, double b) throws RemoteException {
        return a + b;
    }
}
