import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void positiveTestAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("Wrong positive addition", 4, calculator.add(2, 2));
    }

    @Test
    public void negativeTestAddition() {
        Calculator calculator = new Calculator();
        Assert.assertNotEquals("Wrong negative addition", -5, calculator.add(2, -4));
    }
}
