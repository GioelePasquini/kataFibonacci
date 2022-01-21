import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void testing_if_productFib_with_714_works_correctly(){
        ArrayList<Integer> result = fibonacciAnalyzer.productFib(714);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(21);
        expectedResult.add(34);
        expectedResult.add(1);
        assertEquals(result,expectedResult);

    }

    @Test
    public void testing_if_productFib_with_800_works_correctly(){
        ArrayList<Integer> result = fibonacciAnalyzer.productFib(800);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(34);
        expectedResult.add(55);
        expectedResult.add(0);
        assertEquals(result,expectedResult);


    }

    @Test
    public void testing_if_productFib_with_1870_works_correctly(){
        ArrayList<Integer> result = fibonacciAnalyzer.productFib(1870);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(34);
        expectedResult.add(55);
        expectedResult.add(1);
        assertEquals(result,expectedResult);

    }

}