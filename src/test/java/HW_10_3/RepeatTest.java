package HW_10_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class RepeatTest {
    @Test public void test4a() {
        assertEquals("aaaa", Repeat.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Repeat.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Repeat.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Repeat.repeatStr(0, "kata"));
    }

}
