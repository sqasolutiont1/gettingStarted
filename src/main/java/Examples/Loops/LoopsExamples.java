package Examples.Loops;

public class LoopsExamples {
    /**
     * for (T element:Collection obj/array)
     * {
     * statement(s)
     * }
     */
    String[] array = {"Ron", "Harry", "Hermoine"};

    public static void main(String[] args) {
    }

    // for
    /**
     * Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop.
     * An already declared variable can be used or a variable can be declared, local to loop only.
     * Testing Condition: It is used for testing the exit condition for a loop. It must return a boolean value.
     * It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.
     * Statement execution: Once the condition is evaluated to true, the statements in the loop body are executed.
     * Increment/ Decrement: It is used for updating the variable for next iteration.
     * Loop termination:When the condition becomes false, the loop terminates marking the end of its life cycle.
     */

    /**
     * A while loop is a control flow statement that allows code to be
     * executed repeatedly based on a given Boolean condition.
     * The while loop can be thought of as a repeating if statement.
     */
    private void whileloop() {
        int x = 1;

        // Exit when x becomes greater than 4
        while (x <= 4) {
            System.out.println("Value of x:" + x);

            // Increment the value of x for
            // next iteration
            x++;
        }
    }

    /**
     * Enhanced For loop
     */

    /**
     * for (initialization condition; testing condition;
     * increment/decrement)
     * {
     * statement(s)
     * }
     */

    private void forloop() {
        // for loop begins when x=2
        // and runs till x <=4
        for (int x = 2; x <= 4; x++)
            System.out.println("Value of x:" + x);
    }

    //enhanced for loop
    private void eforloop() {
        for (String x : array) {
            System.out.println(x);
        }

        /* for loop for same function
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        */
    }
}
