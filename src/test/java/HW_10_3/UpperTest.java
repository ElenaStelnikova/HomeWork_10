package HW_10_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperTest {
    Upper u = new Upper();

    @Test
    public void testSomething() {
        assertEquals("HELLO",u.MakeUpperCase("hello"));
    }


}
