
package sumar;

import org.junit.Test;
import static org.junit.Assert.*;

public class sumaTest {
   
    @Test
    public void testSumar() {        
        int a = 2;
        int b = 3;
        suma instance = new suma();
        int expResult = 5;        
        int result = instance.sumar(a, b);
        System.out.println("La suma de "+a+" + "+b+" es: "+result);
        assertEquals(expResult, result);
    }    
}
