public class FibonacciAnalyzer {
    public int searchFibonacciNumber(int number) {
        if(number <= 1) {
            return number;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<number; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
