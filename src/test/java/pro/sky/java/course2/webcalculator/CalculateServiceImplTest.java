package pro.sky.java.course2.webcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateServiceImplTest {
    private final CalculateService calculateService = new CalculateServiceImpl();

    @Test
    public void plusTest() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1+num2;
        assertEquals(expected, calculateService.plus(num1, num2));
    }
    @Test
    public void minusTest() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1-num2;
        assertEquals(expected, calculateService.minus(num1, num2));
    }
    @Test
    public void multiplyTest() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1*num2;
        assertEquals(expected, calculateService.multiply(num1, num2));
    }
    @Test
    public void divideTest() {
        int num1 = 5;
        int num2 = 5;
        int expected = num1/num2;
        assertEquals(expected, calculateService.divide(num1, num2));
    }

    @Test
    public void illegalArgumentExceptionWhenDivideZero() {
        int num1 = 5;
        int num2 = 0;
        assertThrows(IllegalArgumentException.class, () -> calculateService.divide(num1, num2));

    }
}
