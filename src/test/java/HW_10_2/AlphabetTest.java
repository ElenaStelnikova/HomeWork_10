package HW_10_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetTest {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Alphabet.position('a'));
        assertEquals("Position of alphabet: 26", Alphabet.position('z'));
        assertEquals("Position of alphabet: 5", Alphabet.position('e'));
    }
}
