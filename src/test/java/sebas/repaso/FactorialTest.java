/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sebas.repaso;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    private Factorial fact;
    
    @Before
    public void setUp(){
        fact = new Factorial();
    }
    
    @Test
    public void NoNigga() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           Factorial.calcular(-23);
        });
        
        assertEquals("El nu mero no puede ser negativo",exception.getMessage());
    }
    
}
