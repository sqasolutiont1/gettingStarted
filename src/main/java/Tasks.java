import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        System.out.println(getElement(list,2));
    }

    /**
     * Factorial
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     * TIP: To make it more interesting, try to do it recursively.
     *
     * @param n
     * @return
     */

    private static Integer factorial(Integer n) {
        int factorial = n;
        for (int j = n - 1; j > 0; j=j-1) {
            factorial = factorial * j;
        }
        return factorial;
    }

    private static int fact(int n) {
        if (n == 1) // exit from recursion condition
            return 1;
        else
            return n * fact(n - 1);
    }

    /**
     * Write a method that sums two numbers.
     *
     * @param i
     * @param j
     * @return
     */
    public Integer sum(Integer i, Integer j) {
        return i + j;
    }

    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     *
     * @param n
     * @return
     */
    public static Integer sum(Integer n) {
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Linear Search
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     *
     * @param n
     * @param array
     * @return
     */
    public int search(Integer n, Integer[] array) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(n)) {
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
     *
     * @param s
     * @return
     */
    public static String reverse(String s) {
        //Google
        String reversedString = "";
        for (int i = 0; i < s.length(); i++) {
            reversedString += s.charAt(s.length() - 1 - i);
        }
        return reversedString;
    }

    /**
     * Find Maximum
     * Write a method that returns the largest integer in the array.
     * You can assume that the array has at least one element.
     *
     * @param array
     * @return
     */
    public static Integer maximum(Integer[] array) {
        int maximum = array[0];
        for (int j = 0; j < array.length; j++) {
            int i = array[j];
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    /**
     * Nth Odd Element
     * Write a method that returns the nth odd element of a list.
     * If the index of the element exceeds the list size, then return -1.
     *
     * @param list
     * @param n
     * @return
     */
    //[1.2.3.45.67.68.77], 2 4
    //[0,1,2,3,4,5,6,7,8,9]
    //odd indexes[1,3,5,7,9]
    public static Integer getElement(List<Integer> list, Integer n) {
        // odd element - is something that you can't divide by 2
        // 2*(4-1) = 6
        int elementIndex = 2 * (n - 1);
        if (elementIndex > list.size() - 1) return -1;
        return list.get(elementIndex);
    }
}
