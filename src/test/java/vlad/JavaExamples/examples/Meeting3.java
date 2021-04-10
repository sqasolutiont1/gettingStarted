package vlad.JavaExamples.examples;


public class Meeting3 {
    public static void main(String... args){
        ifelseConditions(1);
    }

    /**
     * 1. create a method which will return your FirstName
     * 2. create a method which will return your LastName
     * 3. create a method which will concat your FirstName and LastName, and it will insert space between names
     * 4. create a method which will merge any passed names.
     * 5. create a method which will return total amount of the characters in your name, excluding space between names
     */

    //Loops
    private static void printMyNameInLoop(String name){
        for (int i=0; i<4; i=i+1)
        {
            System.out.println(name + " "+ i);
        }
    }

    private static void whileLoopExample(){
        int i = 0;
        while (i < 4){
            System.out.println(i);
            i++;
        }
    }

    private static void dowhileLoopExample(){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<4);
    }


    private static void ifelseConditions(int value){
        if(value<0){
            System.out.println(value+" is negative");
        }
        else if (value>0){
           System.out.println(value+" is positive");
       }
       else{
           System.out.println(value+" is zero");
       }
        System.out.println("just text");
    }

    private static String fullName(String value1, String value2){
        return value1 + " " + value2;
    }

    private static int getNumbers(String value1, String value2){
        return value1.length()+value2.length();
    }

    private static int getNumbers(String value){
        return value.replaceAll("\\s+","").length();
    }

    private static void stringExamples(){
        String firstName = "Vlad";
        String lastName = "Kamenev";
        String fullName = firstName+" "+ lastName;
        System.out.println(fullName);
        String emptyst = "";
        int numberofsymbolsinFirstName = firstName.length();
        System.out.println(numberofsymbolsinFirstName);
        System.out.println(firstName.charAt(3));
        System.out.println(firstName.compareTo(lastName));
        System.out.println(firstName.isEmpty());
        System.out.println(emptyst.isEmpty());
        System.out.println(firstName.replace('V','F'));
        System.out.println(firstName.equals("Vlad"));
    }

    private static void intExamples(){
        int age = 40;
        int phoneNumber = 234234234;
        int countryCode = 1;
        int stateCode = 650;

        ////
        int num1 = 45;
        int numb2 = 6547;
        int sum = num1+numb2;
        System.out.println(sum);
        int mult = num1*numb2;
        System.out.println(mult);

        String fullPhoneNumber = "";
        fullPhoneNumber = String.valueOf(countryCode) +"("+ String.valueOf(stateCode) +")"+ String.valueOf(phoneNumber);
        System.out.println(fullPhoneNumber);
        String integers = "12412432";
        int numbers = Integer.parseInt(integers);
        System.out.println(numbers);
    }

    public static void printme(){
        System.out.println("Something");
        System.out.println(getName());
        System.out.println(getNumber());
        System.out.println(getDouble());
        System.out.println(getFloat());
        System.out.println(getBoolean());

    }
    private static String getName(){
        return "Vlad";
    }

    private static int getNumber(){
        return 2134;
    }

    private static double getDouble(){
        return 234.4;
    }

    private static float getFloat(){
        return 345;
    }

    private static boolean getBoolean(){
        return true;
    }

}
