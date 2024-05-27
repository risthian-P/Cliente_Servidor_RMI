import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class implementacion_interfaz extends UnicastRemoteObject implements interfaz{

    //constructor
    public implementacion_interfaz () throws RemoteException {
        super();
    }
    double result;
    //implementar los metodos indicados eb la interfaz
    @Override
    public String mensaje() throws RemoteException {
        return "Bienvenido a la calculadora...";
    }

    @Override
    public double suma(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double resta(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiplicacion(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double division(double a, double b) throws RemoteException {
        return a / b;
    }
    @Override
    public double operacion (double num1, double num2, double op) throws RemoteException {

        if (op == 1) {
            result = suma(num1, num2);
        } else if (op == 2) {
           result = resta(num1, num2);
        } else if (op == 3) {
            result = multiplicacion(num1, num2);
        } else if (op == 4) {
            result = division(num1, num2);
        }
        return result;
    }
}
