import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestInvalidOperator {
    @Test
    public void testInvalidOperator() {
        Exception exception = Assertions.assertThrows(InvalidInputException.class, () -> {
            Calculator.calculate(10, 20, "divide");
        });

        Assertions.assertTrue(exception.getMessage().contains("Невідома операція"));
    }
}
