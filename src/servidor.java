import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {

        try {
            //crear una instancia de la implementacion de la interfaz
            interfaz objetoRemoto = new implementacion_interfaz(); //viene de la clase implementacion_interfaz

            //crear registro RMI en un puerto especifico
            Registry registro = LocateRegistry.createRegistry(1099);

            //vincular la implementacion remota con un nombre especifico
            registro.rebind("ClienteRemoto", objetoRemoto); //tener en cuenta el nombre para el cliente (tienen que ser iguales)

            System.out.println("Servidor iniciado");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
