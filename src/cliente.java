import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {
    public static void main(String[] args) {

        try {
            //obtener el registro
            Registry registro = LocateRegistry.getRegistry("localhost", 1090);
            //crear instancia de la implementacion de la interfaz
            interfaz objetoRemoto = (interfaz) registro.lookup("ClienteRemoto"); //tener en cuenta el nombre para el cliente (tienen que ser iguales despues del lookup)

            String mensaje = objetoRemoto.mensaje();
            System.out.println(mensaje);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor ingrese el valor a:");
            double var1 = scanner.nextDouble();
            System.out.println("Por favor ingrese el valor b:");
            double var2 = scanner.nextDouble();
            System.out.println("Ingrese la operación que desea realizar (1.suma ,2. resta, 3. multiplicacion, 4. division):");
            double operacion = scanner.nextDouble();

            double resultado = objetoRemoto.operacion(var1, var2, operacion);
            System.out.println(resultado);

//            switch (operacion){
//                case 1:
//                    double resp = objetoRemoto.suma(var1,var2);
//                    System.out.println(resp);
//                case 2:
//                    double resp2 = objetoRemoto.resta(var1,var2);
//                    System.out.println(resp2);
//                case 3:
//                    double resp3 = objetoRemoto.multiplicacion(var1,var2);
//                    System.out.println(resp3);
//                case 4:
//                    double resp4 = objetoRemoto.division(var1,var2);
//                    System.out.println(resp4);
//                default:
//                    System.out.println("Operación no válida. Por favor ingrese +, -, *, o /.");
//            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
