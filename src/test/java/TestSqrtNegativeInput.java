import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestSqrtNegativeInput {
    @Test
    public void testSqrtNegativeInput() {
        Exception exception = Assertions.assertThrows(InvalidInputException.class, () -> {
            Calculator.sqrt(-25.0);
        });

        Assertions.assertEquals("Помилка: Не можна добути корінь з від'ємного числа!", exception.getMessage());
    }
}
