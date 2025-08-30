import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void testGenerateRandomNumber() {
        int a = 10, b = 20;
        int result = RandomNumberGenerator.generateRandomNumber(a, b);
        assertTrue(result >= a && result <= b);
    }

    @Test
    void whenMinEqualsMaxShouldReturnTheSameNumber() {
        int a = 10, b = 10;
        int result = RandomNumberGenerator.generateRandomNumber(a, b);
        assertEquals(a, result);
    }
}