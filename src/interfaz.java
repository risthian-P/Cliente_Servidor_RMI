import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {

    //metodos que el cliente puede invocar de forma remota
    String mensaje () throws RemoteException;
    double suma (double a, double b) throws RemoteException;
    double resta (double a, double b) throws RemoteException;
    double multiplicacion (double a, double b) throws RemoteException;
    double division (double a, double b) throws RemoteException;
    double operacion (double num1, double num2, double op) throws RemoteException;
}
