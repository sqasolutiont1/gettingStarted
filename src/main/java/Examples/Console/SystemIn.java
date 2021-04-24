package Examples.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemIn {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        List<String> list = addValuesToTheList(sc);
        System.out.println(list);
        printMeList(list);
    }

    private static void printMeAnything(Scanner sc){
        while(sc.hasNextLine()) {
            String valueFromTheConsole = sc.nextLine();
            if(!valueFromTheConsole.equals("exit")){
                System.out.println(valueFromTheConsole);
            } else{
                System.exit(0);
            }
        }
    }

    /**
     * implement function which will print list line by line
     * @param list
     */
    private static void printMeList(List<String> list){

    }

    /**
     * create function which will return all the values typed in the console as the List of Strings
     * @return
     */
    private static List<String> addValuesToTheList(Scanner sc){
        /**
         * 1, we gave to creatre a list. Why? we dont have any lists with which we supposed to work.
         * 2. we are going to write values to that list until exit word to be passed
         * 3. we are going to retrun that list as result of the function call.
         */


        /**
         * 1. instatiate a new list
         */
        List<String> list = new ArrayList<>();

        while(sc.hasNextLine()) {
            String valueFromTheConsole = sc.nextLine();
            if(!valueFromTheConsole.equals("exit")){
                list.add(valueFromTheConsole);
            } else{
                return list;
            }
        }
        return list;
    }
}
