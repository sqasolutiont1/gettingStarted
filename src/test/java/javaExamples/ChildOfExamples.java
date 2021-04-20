package javaExamples;

/**
 * Class in Java is a blueprint of the Object.
 */
public class ChildOfExamples extends ParentOfAllExamples{
    int sum = 0;
    /**
     * constructor - is the method, with the same name as the Class
     * it will be automatically executed once you will instantiate the call.
     */
    ChildOfExamples(){
        System.out.println("It's my class");
    }

    public int getMeTheSumOfNumbers(int number1, int number2){
        return number1 + number2;
    }

    private void youDontSeeMe(){}

    public void countBy(int number){
        /**
         * int i=0 - this is where we are starting
         * i < number - this is our condition, once it won't be met - loop will stop
         * i++ - this is our counter of the loops.
         */
        for (int i=0; i < number; i++){
            System.out.println("Number " + i + " from: "+ number);
        }
    }

    public void whileLoop(int number){
        int i = 0;
        while (i<number){
            System.out.println("Number " + i + " from: "+ number);
            i= i+1;// i++
        }
    }

    public void doWhileLoop(int number){
        int i = 0;
        do{
            System.out.println("Number " + i + " from: "+ number);
            i= i+1;// i++
        } while (i<number);
    }

    public void ifCondition(int number){
        if(number>0){
            System.out.println("Positive");
        } else if (number<0){
            System.out.println("Negative");
        } else{
            System.out.println("Zero");
        }
    }

    public void visibilityOfVariables(int number){
        sum = number + number;
    }

    public void tryingToUserVar(){
        System.out.println(sum);
    }

}
