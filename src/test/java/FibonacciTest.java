import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    FibonacciAnalyzer fibonacciAnalyzer;

    @Before
    public void setUp() {
        fibonacciAnalyzer = new FibonacciAnalyzer();
    }

    @Test
    public void testing_fibonacci_of_8() {

        int result = fibonacciAnalyzer.searchFibonacciNumber(8);

        assertEquals(result, 21);
    }
}