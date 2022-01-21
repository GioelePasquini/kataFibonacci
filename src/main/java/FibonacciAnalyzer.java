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
        boolean control = false;
        for (int i = 0; i < product; i++) {
            if (productIsProductOfTwoConsecutiveFib(product, i)) {
                popolateArrayListifProductIsProductOfConsecutiveFib(result, i);
                control = true;
            }
        }
        if (control == false) {
            for (int i = 0; i < product; i++) {
                if (SearchFirstTwoFibWichProductIsGreatherThanProduct(product, i)) {
                    popolateArrayListifProductIsNotProductOfConsecutiveFib(result, i);
                    break;
                }
            }
        }
        return result;
    }

    private boolean SearchFirstTwoFibWichProductIsGreatherThanProduct(int product, int i) {
        return searchFibonacciNumber(i) * searchFibonacciNumber(i + 1) > product;
    }

    private void popolateArrayListifProductIsNotProductOfConsecutiveFib(ArrayList<Integer> result, int i) {
        result.add(searchFibonacciNumber(i));
        result.add(searchFibonacciNumber(i + 1));
        result.add(0);
    }

    private boolean productIsProductOfTwoConsecutiveFib(int product, int i) {
        return searchFibonacciNumber(i) * searchFibonacciNumber(i + 1) == product;
    }

    private void popolateArrayListifProductIsProductOfConsecutiveFib(ArrayList<Integer> result, int i) {
        result.add(searchFibonacciNumber(i));
        result.add(searchFibonacciNumber(i + 1));
        result.add(1);
    }
}
