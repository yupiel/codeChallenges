package azubi.challenges.task003;

import org.junit.Test;
import static org.junit.Assert.*; 

import azubi.challenges.task003.StringCompressor;

public class StringCompressorTest {

    @Test
    public void compress_shouldReturn_same_string_when_empty() {
        String given = "";
        String expected = "";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_same_string() {
        String given = "abcdef";
        String expected = "abcdef";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_not_compressed_string() {
        String given = "aabbcc";
        String expected = "aabbcc";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_compressed_string_simple() {
        String given = "aaa";
        String expected = "a3";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_compressed_string_twice() {
        String given = "aaabbb";
        String expected = "a3b3";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_compressed_string() {
        String given = "abcaaabbb";
        String expected = "abca3b3";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }

    @Test
    public void compress_shouldReturn_compressed_string_longInput() {
        String given = "aaabaaaaccaaaaba";
        String expected = "a3ba4c2a4ba";

        String actual = StringCompressor.compress(given);

        assertEquals(actual, expected);
    }
}