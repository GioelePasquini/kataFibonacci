import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Before
    public void setUp(){

    }

    @Test
    public void testing_fibonacci_of_8(){
        FibonacciAnalyzer fibonacciAnalyzer = new FibonacciAnalyzer();
        int result = fibonacciAnalyzer.searchFibonacciNumber(8);

        assertEquals(result, 21);
    }
}
