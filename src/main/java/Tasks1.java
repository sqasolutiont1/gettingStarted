public class Tasks1 {
    public static void main(String args[]){

    }

    /**
     *  find the n-th element of Fibonacci Sequence
     * @param n
     * @return
     */
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
