package bancaentornos;

import java.time.*;

/**
 *
 * @author guille
 * @version 1.0
 */
public class Cliente {

    /*ATRIBUTOS*/
    private String nombre;
    private String apellido;
    private String direccion;
    private String nif;
    private int telefono;
    private int edad;
    private int saldo;
    private int numeroCuenta;

    /*CONSTRUCTOR*/
    public Cliente(String n, String a, String d, String ni, int t, int e, int s, int num) {
        this.nombre = n;
        this.apellido = a;
        this.direccion = d;
        this.nif = ni;
        this.telefono = t;
        this.edad = e;
        this.saldo = s;
        this.numeroCuenta = num;
    }

    /*MÉTODOS*/

    /**
     * Metodo para ingresar dinero
     *
     * @param cantidad Ingresa dinero en la cuenta
     */
    public void ingresarSaldo(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Tu saldo se queda asi: " + this.saldo);

    }

    /**
     * Metodo para retirar dinero
     *
     * @param cantidad retira dinero de la cuenta, comprueba que el saldo sea >0
     */
    public void retirarSaldo(double cantidad) {
        if (cantidad <= saldo) {
            System.out.println("Tiene suficiente saldo");

            this.saldo -= cantidad;
            System.out.println("Te queda esta cantidad de saldo " + this.saldo);
        } else {
            System.out.println("No tiene suficiente saldo");
        }
    }

    /**
     * Consulta el saldo
     */
    public void consultarSaldo() {
        System.out.println("Actualmente la cuenta dispone de " + this.getSaldo() + " euros");
    }

    /*MÉTODOS GETTER Y SETTERS*/
    /**
     * Gettter numeroCuenta
     *
     * @return numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * setter numerCuenta Para modificar el atributo
     *
     * @param numeroCuenta
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * getter nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter nombre Modifica el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter apellido
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * setter apellido modificar apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * getter direccion
     *
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * setter direccion modifica direccion
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * getter NIF
     *
     * @return NIF
     */
    public String getNif() {
        return nif;
    }

    /**
     * setter nif modifica el nif
     *
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * getter Telefono
     *
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * setter telefono modifica el telefono
     *
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * getter edad
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * setter edad modifica la edad
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * getter saldo
     *
     * @return saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * setter saldo modifica el saldo
     *
     * @param saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /*TOSTRING PARA MOSTRAR INFO */
    /**
     * Metodo toString muestra informacion
     *
     * @return
     */
    @Override
    public String toString() {
        return "[Cliente]" + "Nombre=" + nombre + "| Apellido=" + apellido + "| Direccion=" + direccion + "| Nif=" + nif + "| Telefono=" + telefono + "| Edad=" + edad + "| Saldo=" + saldo + "| NumeroCuenta=" + numeroCuenta;
    }

}
