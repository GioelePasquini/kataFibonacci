import java.util.ArrayList;

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

    public ArrayList<Integer> productFib(int product) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < product; i++) {
            if (searchFibonacciNumber(i) * searchFibonacciNumber(i + 1) == product) {
                result.add(searchFibonacciNumber(i));
                result.add(searchFibonacciNumber(i + 1));
                result.add(1);
                flag = true;
            }
        }
        if (flag == false) {
            for (int i = 0; i < product; i++) {
                if (searchFibonacciNumber(i) * searchFibonacciNumber(i + 1) > product) {
                    result.add(searchFibonacciNumber(i));
                    result.add(searchFibonacciNumber(i + 1));
                    result.add(0);
                    break;

                }

            }
        }
        return result;
    }
}
