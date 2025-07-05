import org.junit.Assert;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void TestAssertions() {

        Assert.assertEquals("62 is not greater than 20 + 42", 62, 20 + 42);

        Assert.assertTrue("5 is not greater than -9", 5 > -9);

        Assert.assertFalse("20 is greater than 99",20 > 99);

        Assert.assertNull("Null check fail", null);

        Assert.assertNotNull("The object is not null", new Object());
    }
}
