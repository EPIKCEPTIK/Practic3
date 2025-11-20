import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDivideByZero {
    @Test
    public void testDivideByZero() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10.0, 0.0);
        });

        Assertions.assertTrue(exception.getMessage().contains("Ділення на нуль"));
    }
}
