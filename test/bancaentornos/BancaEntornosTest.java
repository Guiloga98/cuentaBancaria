
package bancaentornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guille
 */
public class BancaEntornosTest {
    
    public BancaEntornosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   

    /**
     * Test of ingresar method, of class BancaEntornos.
     */
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        BancaEntornos.ingresar();
        
    }

    
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        BancaEntornos.retirar();
        
    }

    
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        BancaEntornos.consultar();
        
    }

   
    @Test
    public void testMenuAtencionCliente() {
        System.out.println("menuAtencionCliente");
        int expResult = 0;
        int result = BancaEntornos.menuAtencionCliente();
        assertEquals(expResult, result);
       
    }

   
    @Test
    public void testModificarNombre() {
        System.out.println("modificarNombre");
        BancaEntornos.modificarNombre();
        
    }

    
    @Test
    public void testModificarApellido() {
        System.out.println("modificarApellido");
        BancaEntornos.modificarApellido();
       
    }

    
    @Test
    public void testModificarEdad() {
        System.out.println("modificarEdad");
        BancaEntornos.modificarEdad();
        
    }

    
    @Test
    public void testModificarDireccion() {
        System.out.println("modificarDireccion");
        BancaEntornos.modificarDireccion();
        
    }

    
    @Test
    public void testModificarTelefono() {
        System.out.println("modificarTelefono");
        BancaEntornos.modificarTelefono();
        
    }
    
}
