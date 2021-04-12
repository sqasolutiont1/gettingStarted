import java.util.List;

public class Tasks {
    public static void main(String[] args){
        System.out.println(fact(10));
        System.out.println(factorial(10));
    }

    /**
     * Write a method that sums two numbers.
     * @param i
     * @param j
     * @return
     */
    public Integer sum(Integer i, Integer j) {
        return i +  j;
    }

    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     * @param n
     * @return
     */
    public Integer sum(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Factorial
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     * TIP: To make it more interesting, try to do it recursively.
     * @param n
     * @return
     */
    public static Integer factorial(Integer n) {
        int factorial = n;
        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        return factorial;
    }


    private static int fact(int n){

        if (n == 1) // base condition
            return 1;
        else
            return n*fact(n-1);
    }

    /**
     * Linear Search
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     * @param n
     * @param list
     * @return
     */
    public int search(Integer n, Integer[] list) {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Reverse String
     * Write a method that reverses a string.
     * For example, 'java interview' becomes 'weivretni avaj'.
     * @param s
     * @return
     */
    public String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }
        return result;
    }

    /**
     * Find Maximum
     * Write a method that returns the largest integer in the list.
     * You can assume that the list has at least one element.
     * @param list
     * @return
     */
    public Integer maximum(Integer[] list) {
        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    /**
     * Nth Odd Element
     * Write a method that returns the nth odd element of a list. If the index of the element exceeds the list size, then return -1.
     * @param list
     * @param n
     * @return
     */
    public Integer getElement(List<Integer> list, Integer n) {
        int elementIndex = 2 * (n-1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
    }
}
