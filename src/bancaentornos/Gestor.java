
package bancaentornos;
import java.util.Scanner;
/**
 *
 * @author guille
 * @version 1.0
 */

public class Gestor implements ClaseIntermediaMetodos {
    
static Scanner sc = new Scanner(System.in);

    @Override
    public void modificarNombre(Cliente c) {
        System.out.println("Introduzca un nuevo nombre");
        String nombre = sc.nextLine();
        c.setNombre(nombre);
        System.out.println("El nombre ha sido modificado correctamente");
    }

    @Override
    public void modificarApellido(Cliente c) {
        System.out.println("Introduzca un nuevo apellido");
        String apellido = sc.nextLine();
        c.setApellido(apellido);
        System.out.println("El apellido ha sido modificado correctamente");
        
    }

    @Override
    public void modificarDireccion(Cliente c) {
        System.out.println("Introduzca una nueva direccion");
        String direccion = sc.nextLine();
        c.setDireccion(direccion);
        System.out.println("La direccion ha sido modificada correctamente");
        
    }

    @Override
    public void modificarEdad(Cliente c) {
        System.out.println("Introduzca una nueva edad");
        int edad = sc.nextInt();
        c.setEdad(edad);
        System.out.println("La edad ha sido modificada correctamente");
        
    }

    @Override
    public void modificarTelefono(Cliente c) {
        System.out.println("Introduzca un nuevo numero de telefono");
        int tlf = sc.nextInt();
        c.setTelefono(tlf);
        System.out.println("El telefono ha sido modificado correctamente");
        
    }
    
    
   
  
       
        
    }

    

   
    
    
    
    
    
    

