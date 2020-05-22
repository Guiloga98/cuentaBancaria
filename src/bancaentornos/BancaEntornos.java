package bancaentornos;

import java.util.*;

/**
 *
 * @author guille
 * @version 1.0
 */
public class BancaEntornos {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Cliente> cuentasClientes = new ArrayList();
    static Random rnd = new Random();
    static int numerocuenta;
    static Gestor Paco = new Gestor();
    static boolean salir = false;
    static int contador = 0;

    public static void main(String[] args) {

        cuentasClientes.add(new Cliente("Guillermo", "Lopez", "Ugena", "12345678V", 655842170, 22, 300, 40));
        cuentasClientes.add(new Cliente("Pepe", "Gutierrez", "Fuenlabrada", "987654321Q", 212121212, 40, 3100, 26));
        cuentasClientes.add(new Cliente("Rosa", "Galan", "Mostoles", "56781234Z", 301297513, 30, 1000, 25));
        cuentasClientes.add(new Cliente("Carla", "Saelices", "Leganes", "02851321K", 1987690, 18, 100, 50));
        
        

        

        try {
            int opcion;
            opcion = menu();

            while (opcion != 0) {

                switch (opcion) {
                    case 1:
                        menu2();
                        dentroCuentaCliente(numerocuenta);
                        int opcion2;
                        opcion2 = menu3();
                        while (opcion2 != 5) {
                            try {
                                switch (opcion2) {
                                    case 1:
                                        ingresar();

                                        break;
                                    case 2:
                                        retirar();

                                        break;
                                    case 3:
                                        consultar();

                                        break;
                                    case 4:
                                        int opcion3;
                                        opcion3 = menuAtencionCliente();
                                        while (opcion3 != 6) {
                                            switch (opcion3) {
                                                case 1:
                                                        modificarNombre();
                                                    break;
                                                case 2:
                                                    modificarApellido();
                                                    break;
                                                case 3:
                                                    modificarDireccion();
                                                    break;
                                                case 4:
                                                    modificarEdad();
                                                    break;
                                                case 5:
                                                    modificarTelefono();
                                                    break;

                                            }
                                            opcion3 = menuAtencionCliente();
                                        }
                                        break;
                                    case 5:

                                        break;

                                }
                                opcion2 = menu3();
                            } catch (InputMismatchException e) {
                                System.out.println("\nError de tipo. Por favor, introduzca un número entero.\n");
                                sc.nextLine();

                            }
                        }
                        break;
                    case 2:
                        mostrarCuentas();
                        break;
                    case 3:
                        crearCuenta();
                        break;
                    case 0:

                        break;
                    default:
                        break;
                }
                opcion = menu();
            }

        } catch (InputMismatchException e) {
            System.out.println("\nError de tipo. Por favor, introduzca un número entero.\n");
            sc.nextLine();

        }
    }

    public static int menu() {
        System.out.println("+---------------------------------------------+");
        System.out.println("| Bienvenido a la aplicacion del banco        |");
        System.out.println("| Por favor marque una casilla:               |");
        System.out.println("| 1-Realizar operaciones                      |");
        System.out.println("| 2-Mostrar cuentas                           |");
        System.out.println("| 3-Crear cuenta                              |");
        System.out.println("| 0-Salir                                     |");
        System.out.println("+---------------------------------------------+");
        System.out.print("\t->: ");
        return (sc.nextInt());
    }

    public static int menu2() {
        System.out.println("+-------------------------------------------+");
        System.out.println("| Has seleccionado entrar en su cuenta       |");
        System.out.println("| Por favor introduzca los siguientes datos: |");
        System.out.println("| -Número de cuenta:                         |");
        System.out.println("+--------------------------------------------+");
        System.out.print("\t->: ");
        numerocuenta = sc.nextInt();

        return numerocuenta;
    }

    public static int menu3() {
        System.out.println("+-------------------------------------------+");
        System.out.println("| Bienvenido a su cuenta                     |");
        System.out.println("| Por favor indique que desea realizar:      |");
        System.out.println("| 1-Ingresar dinero                          |");
        System.out.println("| 2-Retirar dinero                           |");
        System.out.println("| 3-Consultar saldo                          |");
        System.out.println("| 4-Solicitar a un gestor ayuda              |");
        System.out.println("| 5-Volver al menu principal                 |");
        System.out.println("+--------------------------------------------+");
        System.out.print("\t->: ");

        return (sc.nextInt());
    }

    public static void dentroCuentaCliente(int num) {
        //boolean encontrado = false;
        boolean salida=false;
        int contador = 0;
        while(!salida){
        for (int i = 0; i < cuentasClientes.size() /*&& !encontrado*/; i++) {
            if (num == cuentasClientes.get(i).getNumeroCuenta()) {
                
                //encontrado = true;
                contador++;
            } 

        }
        if (contador==1) {
            System.out.println("+-------------------+");
            System.out.println("| CUENTA ENCONTRADA |");
            System.out.println("+-------------------+");
            salida=true;
        } else{
            System.out.println("+--------------------------------+------+");
            System.out.println("| ERROR, ese numero de cuenta no existe |");
            System.out.println("| Por favor introduzca uno nuevo        |");
            System.out.println("+---------------------------------------+");
            System.out.print("\t->: ");
            num=sc.nextInt();
        }
        }
    }
    
  
    

    public static void mostrarCuentas() {
        System.out.println("+-----------------------------+");
        System.out.println("| MOSTRANDO TODAS LAS CUENTAS |");
        System.out.println("+-----------------------------+");
        for (int i = 0; i < cuentasClientes.size(); i++) {
            System.out.println(cuentasClientes.get(i));
        }
    }

    public static void crearCuenta() {
        System.out.println("+------------------------------------+");
        System.out.println("| Has elegido crear una nueva cuenta |");
        System.out.println("| Por favor introduzca su nombre     |");
        System.out.println("+------------------------------------+");
        String nombre = sc.next();
        System.out.println("+--------------------------------+");
        System.out.println("| Introduzca su primer apellido  |");
        System.out.println("+--------------------------------+");
        String apellido = sc.next();
        System.out.println("+-------------------------+");
        System.out.println("| Introduzca su direccion |");
        System.out.println("+-------------------------+");
        String direccion = sc.next();
        System.out.println("+-------------------+");
        System.out.println("| Introduzca su nif |");
        System.out.println("+-------------------+");
        String nif = sc.next();
        System.out.println("+--------------------+");
        System.out.println("| Introduzca su edad |");
        System.out.println("+--------------------+");
        int edad = sc.nextInt();
        System.out.println("+------------------------+");
        System.out.println("| Introduzca su telefono |");
        System.out.println("+------------------------+");
        int tlf = sc.nextInt();
        cuentasClientes.add(new Cliente(nombre, apellido, direccion, nif, edad, tlf, 0, generarNumCuenta()));
        System.out.println("+----------------------------------------------------------------------------+");
        System.out.println("| Su cuenta se ha creado correctamente señor/a " + nombre + " " + apellido+" |");
        System.out.println("| Le recordamos que su cuenta actualmente dispone de un saldo de 0€          |");
        System.out.println("+----------------------------------------------------------------------------+");

    }

    public static int generarNumCuenta() {
        int n = rnd.nextInt(75 - 25 + 1) + 25;
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (n == cuentasClientes.get(i).getNumeroCuenta()) {
                n = rnd.nextInt(75 - 25 + 1) + 25;
                return n;
            } else {
                n = rnd.nextInt(75 - 25 + 1) + 25;
            }
        }

        return n;
    }

    public static void ingresar() {
        boolean ingresar = false;
        System.out.println("+-----------------------------------+");
        System.out.println("| Ha dedicido ingresar dinero       |");
        System.out.println("| Introduzca la cantidad a ingresar |");
        System.out.println("+-----------------------------------+");
        int ingreso = sc.nextInt();
        for (int i = 0; i < cuentasClientes.size() && !ingresar; i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {

                cuentasClientes.get(i).ingresarSaldo(ingreso);
                ingresar = true;
            }

        }

    }

    public static void retirar() {
        boolean retirar = false;
        System.out.println("+-----------------------------------+");
        System.out.println("| Ha dedicido retirar dinero        |");
        System.out.println("| Introduzca la cantidad a retirar  |");
        System.out.println("+-----------------------------------+");
        int retirada = sc.nextInt();
        for (int i = 0; i < cuentasClientes.size() && !retirar; i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {

                cuentasClientes.get(i).retirarSaldo(retirada);
                retirar = true;
            }

        }
    }

    public static void consultar() {
        System.out.println("+--------------------------------+");
        System.out.println("| Ha dedicido consultar tu saldo |");
        System.out.println("+--------------------------------+");
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {

                cuentasClientes.get(i).consultarSaldo();

            }

        }
    }

    public static int menuAtencionCliente() {
        System.out.println("+------------------------------------------------+");
        System.out.println("| Has pulsado sobre atencional cliente           |");
        System.out.println("| ¿En que podemos ayudar?                        |");
        System.out.println("| 1-Modificar nombre del titular de la cuenta    |");
        System.out.println("| 2-Modificar apellido del titular de la cuenta  |");
        System.out.println("| 3-Modificar direccion                          |");
        System.out.println("| 4-Modificar edad                               |");
        System.out.println("| 5-Modificar telefono                           |");
        System.out.println("| 6-Volver al menu de operaciones                |");
        System.out.println("+------------------------------------------------+");

        System.out.print("\t->: ");
        return (sc.nextInt());
    }
    
    public static void modificarNombre(){
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {
                Paco.modificarNombre(cuentasClientes.get(i));
            }
        }
       
    }
    
    public static void modificarApellido(){
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {
                Paco.modificarApellido(cuentasClientes.get(i));
            }
        }
       
    }
    
    public static void modificarEdad(){
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {
                Paco.modificarEdad(cuentasClientes.get(i));
            }
        }
       
    }
    
    
    public static void modificarDireccion(){
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {
                Paco.modificarDireccion(cuentasClientes.get(i));
            }
        }
       
    }
    
    public static void modificarTelefono(){
        for (int i = 0; i < cuentasClientes.size(); i++) {
            if (cuentasClientes.get(i).getNumeroCuenta() == numerocuenta) {
                Paco.modificarTelefono(cuentasClientes.get(i));
            }
        }
       
    }

}
