package vlad.JavaExamples.examples;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Meeting3 {
    public static void main(String... args){
        printLists();
    }

    //Lists
    private static void printLists(){
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        System.out.println(stringList.get(0));
        System.out.println(stringList.size());
        for(int i = 0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
        stringList.remove(1);
        for(int i = 0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        stringList.set(0,"zero");
        for(int i = 0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        stringList.clear();

        System.out.println(stringList.size());
    }

    //Arrays
    private static void printArrays(){
        String[] strings = {"one","two", "three", "four"};
        Integer[] integers = {12,34,545,6776,89,65443,32,542};
        String[][] strings1 = {{"one","two", "three", "four"},{"five","six", "seven", "eight"}};
        System.out.println(strings.length);
        String strings12 = strings[0];
        int arrayLength = integers.length;

        for (int i = 0; i<arrayLength; i++){
            System.out.println(integers[i]);
        }
    }


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

//Conditions
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
