package Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExampleTest {
    @Test
    void test() {
        int[] arr = {1, 2, 3, 4};
        int[] actual = Example.reverse(arr);

        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, actual);
    }
}