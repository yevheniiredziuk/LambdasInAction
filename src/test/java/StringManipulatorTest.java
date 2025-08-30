import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// this test is redundant in my opinion
// as we don't test the interface itself,
// only its implementation
class StringManipulatorTest {

    @Test
    void testStringManipulator() {
        StringManipulator toUpper = String::toUpperCase;
        String a = "a";
        String expected = "A";
        assertEquals(expected, toUpper.operate(a));
    }
}