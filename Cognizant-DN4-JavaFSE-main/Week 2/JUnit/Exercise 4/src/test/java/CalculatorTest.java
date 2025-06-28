import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @After
    public void teardown() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        Assert.assertEquals(6, result);
    }
}
