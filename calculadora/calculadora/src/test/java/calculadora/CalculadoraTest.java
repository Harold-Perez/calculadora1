package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5.0, calc.sumar(2, 3), 0.001);
    }

    @Test
    public void testRestar() {
        assertEquals(1.0, calc.restar(5, 4), 0.001);
    }

    @Test
    public void testMultiplicar() {
        assertEquals(12.0, calc.multiplicar(3, 4), 0.001);
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(10, 5), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        calc.dividir(5, 0);
    }
}
