public class Tasks1 {
    public static void main(String[] args) {

    }

    /**
     * find the n-th element of Fibonacci Sequence
     *
     * @param n
     * @return
     */
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public Integer find(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public Integer evenFibonacciSum(Integer n) {
        int previousFibonacci = 1;
        int currentFibonacci = 2;
        int evenFibonacciSum = 0;
        do {
            if (currentFibonacci % 2 == 0) {
                evenFibonacciSum += currentFibonacci;
            }
            int newFibonacci = currentFibonacci + previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = newFibonacci;
        } while (currentFibonacci < n);
        return evenFibonacciSum;
    }
}
