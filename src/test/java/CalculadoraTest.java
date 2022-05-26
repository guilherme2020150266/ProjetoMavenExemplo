import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {


    @Test
    public void testSoma() {
        Calculadora c = new Calculadora(4,3);
        assertEquals(7.0, c.soma(),0.001);
    }
}
