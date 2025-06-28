import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("Addition contains errors", -39, calculator.add(-90, 51));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("Subtraction contains errors", 42, calculator.subtract(100, 58));
    }
}
