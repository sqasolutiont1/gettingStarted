package Examples.Console;

import java.util.*;

public class SystemIn {
    List<String> listToPasData = new ArrayList<>();

    public static void main(String... args) {
        maps("fedgsedf ", "Aaerfgerfge", "wefewrwfr");
    }

    /**
     * create a function which will create a map of the passed strings. keys should be filled in from 0 to
     * the number of the passed arguments.
     *
     * @param sc
     */
    private static void maps(String... args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 1; i < args.length; i++) {
            map.put(i, args[i]);
        }
    }

    private static void printMeAnything(Scanner sc) {
        while (sc.hasNextLine()) {
            String valueFromTheConsole = sc.nextLine();
            if (!valueFromTheConsole.equals("exit")) {
                System.out.println(valueFromTheConsole);
            } else {
                System.exit(0);
            }
        }
    }

    /**
     * implement function which will print list line by line
     *
     * @param list
     */
    private static void printMeList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    /**
     * create function which will return all the values typed in the console as the List of Strings
     *
     * @return
     */
    private static List<String> addValuesToTheList(Scanner sc) {
        /**
         * 1, we gave to creatre a list. Why? we dont have any lists with which we supposed to work.
         * 2. we are going to write values to that list until exit word to be passed
         * 3. we are going to retrun that list as result of the function call.
         */


        /**
         * 1. instatiate a new list
         */
        List<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String valueFromTheConsole = sc.nextLine();
            if (!valueFromTheConsole.equals("exit")) {
                list.add(valueFromTheConsole);
            } else {
                return list;
            }
        }
        return list;
    }

    private static void mapsExample() {
        Map<String, Integer> hm
                = new HashMap<String, Integer>();

        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        hm.replace("d", 500);
        hm.remove("a");
        // Traversing through the map
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
