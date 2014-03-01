package week2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author JiHong Jang
 * @since 2014.03.02
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(calculator.add(1, 2), 3);
    }
    @Test
    public void minus() {
        assertEquals(calculator.minus(1, 2), -1);
    }
    @Test
    public void mul() {
        assertEquals(calculator.mul(1, 2), 2);
    }
    @Test
    public void div() {
        assertEquals(calculator.div(1, 2), 0);
    }
}
