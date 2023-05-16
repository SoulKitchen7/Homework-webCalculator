package pro.sky.java.course2.webcalculator;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateServiceImplParametrizedTest {
    private final CalculateService calculateService = new CalculateServiceImpl();

    public static Stream<Arguments> argumentsSourcePlusTest() {
        return Stream.of(
                Arguments.of( 1, 2, 3),
                Arguments.of( 2, 2, 4),
                Arguments.of( 1, 1, 2)
        );
    }
    public static Stream<Arguments> argumentsSourceMinusTest() {
        return Stream.of(
                Arguments.of( 1, 1, 0),
                Arguments.of( 2, 1, 1),
                Arguments.of( 3, 1, 2)
        );
    }
    public static Stream<Arguments> argumentsSourceMultiplyTest() {
        return Stream.of(
                Arguments.of( 1, 1, 1),
                Arguments.of( 2, 1, 2),
                Arguments.of( 3, 1, 3)
        );
    }
    public static Stream<Arguments> argumentsSourceDivideTest() {
        return Stream.of(
                Arguments.of( 1, 1, 1),
                Arguments.of( 2, 1, 2),
                Arguments.of( 3, 1, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsSourcePlusTest")
    public void plusTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, calculateService.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("argumentsSourceMinusTest")
    public void minusTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, calculateService.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("argumentsSourceMultiplyTest")
    public void multiplyTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, calculateService.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("argumentsSourceDivideTest")
    public void divideTest(int num1, int num2, int expected) {
        Assertions.assertEquals(expected, calculateService.divide(num1, num2));
    }
}
