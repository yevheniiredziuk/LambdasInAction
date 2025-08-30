import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {
    // this test is redundant in my opinion
    // as we don't test the interface itself,
    // only its implementation
    @Test
    void testAddition() {
        MathOperation operation = Integer::sum;
        assertEquals(4, operation.operate(2, 2));
        assertNotEquals(2, operation.operate(2, 4));
    }
}