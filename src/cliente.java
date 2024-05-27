import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
    public static void main(String[] args) {

        try {
            //obtener el registro
            Registry registro = LocateRegistry.getRegistry("172.31.115.130", 1099);
            //crear instancia de la implementacion de la interfaz
            interfaz objetoRemoto = (interfaz) registro.lookup("ClienteRemoto"); //tener en cuenta el nombre para el cliente (tienen que ser iguales despues del lookup)

            String mensaje = objetoRemoto.mensaje();
            System.out.println(mensaje);

            double resp = objetoRemoto.suma(6,7);
            System.out.println(resp);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
