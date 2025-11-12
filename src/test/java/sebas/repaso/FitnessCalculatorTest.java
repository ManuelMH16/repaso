package sebas.repaso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author PC
 */
public class FitnessCalculatorTest {
    
    private FitnessCalculator fit;
    
    @Before
    public void setUp(){
        fit = new FitnessCalculator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void NoaceptaNegativos() {
        fit.calcularCaloriasQuemadas("cardio", -3);
    }
    
    @Test
    public void CaloriasxMinuto(){
        assertEquals(10, fit.calcularCaloriasQuemadas("cardio", 1));
    }
    
   @Test
    public void Pesomayora0(){
        Exception excepcion2 = assertThrows(IllegalArgumentException.class, () -> {
            fit.calcularIMC(0, 2);
        });
        
        assertEquals("El dd peso y la altura deben ser mayores que cero", excepcion2.getMessage());
    } 
}
