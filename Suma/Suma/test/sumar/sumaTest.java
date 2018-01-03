/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class sumaTest {
    /**
     * Test of sumar method, of class suma.
     */
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
