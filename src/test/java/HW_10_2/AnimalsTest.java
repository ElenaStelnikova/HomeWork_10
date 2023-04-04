package HW_10_2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnimalsTest {
    @Test
    public void fixedTest() {
        assertTrue(Animals.feast("great blue heron","garlic nann"));
        assertTrue(Animals.feast("chickadee","chocolate cake"));
        assertFalse(Animals.feast("brown bear","bear claw"));
    }

}
