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
    public double operacion(double num1, double num2, double op) throws RemoteException {
        double result = 0;
        try {
            switch ((int) op) {
                case 1:
                    result = suma(num1, num2);
                    break;
                case 2:
                    result = resta(num1, num2);
                    break;
                case 3:
                    result = multiplicacion(num1, num2);
                    break;
                case 4:
                    result = division(num1, num2);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

}
