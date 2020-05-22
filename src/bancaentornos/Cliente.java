
package bancaentornos;
import java.time.*;
/**
 *
 * @author guille
 * @version 1.0
 */
public class Cliente{
    
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
        this.numeroCuenta=num;
    }
    /*MÉTODOS*/
   public void ingresarSaldo(double cantidad){
       this.saldo+=cantidad;
        System.out.println("Tu saldo se queda asi: "+this.saldo);
        
    }
   
   public void retirarSaldo(double cantidad){
     if(cantidad<=saldo){
         System.out.println("Tiene suficiente saldo");
         
         this.saldo-=cantidad;
         System.out.println("Te queda esta cantidad de saldo "+this.saldo);
     }   
     
     else
            System.out.println("No tiene suficiente saldo");
    }
    
   public void consultarSaldo(){
        System.out.println("Actualmente la cuenta dispone de "+this.getSaldo()+" euros");
    }
   
  
/*MÉTODOS GETTER Y SETTERS*/
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

  
    
    
    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getNif() {
        return nif;
    }

    
    public void setNif(String nif) {
        this.nif = nif;
    }

    
    public int getTelefono() {
        return telefono;
    }

    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    public int getSaldo() {
        return saldo;
    }

   
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /*TOSTRING PARA MOSTRAR INFO */
    @Override
    public String toString() {
        return "[Cliente]" + "Nombre=" + nombre + "| Apellido=" + apellido + "| Direccion=" + direccion + "| Nif=" + nif + "| Telefono=" + telefono + "| Edad=" + edad + "| Saldo=" + saldo + "| NumeroCuenta=" + numeroCuenta ;
    }

    
    
}
