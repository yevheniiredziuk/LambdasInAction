import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListProcessorTest {


    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, StringListProcessor.countUppercase(""));
    }

    @Test
    public void shouldReturn5IfStringIsABCDE(){
        assertEquals(5, StringListProcessor.countUppercase("ABCDE"));
    }

    @Test
    public void shouldReturnZeroIfStringIsInLowerCase(){
        assertEquals(0, StringListProcessor.countUppercase("abcd"));
    }

    @Test
    public void shouldReturnZeroIfOnlySpecialCharactersAndDigitsIsInTheString(){
        assertEquals(0, StringListProcessor.countUppercase("123$#@&*"));
    }

    @Test
    public void shouldReturn3InMixedCase(){
        assertEquals(3, StringListProcessor.countUppercase("AaBbEh"));
    }
}