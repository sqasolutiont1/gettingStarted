package estella.examples;

import workingwithclasses.PrintMeAnything;

public class Meeting3 {
    public static void main(String... args){
        PrintMeAnything printMeAnything = new PrintMeAnything();

//        PrintMeAnything.printmeregardless();
//        System.out.println(PrintMeAnything.numbers);
//        PrintMeAnything printMeAnything = new PrintMeAnything();
//        printMeAnything.printMeString("This is a string");

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
