package javaExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrLIsts {
        public static void main(String[] args) {
            System.out.println("1. Create a new array list, add some cards, and print out the collection.");
            List<String> list_Strings = new ArrayList<String>();
            list_Strings.add("Ace of Clubs");
            list_Strings.add("Ace of Hearts");
            list_Strings.add("Ace of Diamonds");
            list_Strings.add("Ace of Spades");
            list_Strings.add("Jack of Clubs");
            System.out.println(list_Strings);
            // Print the list
            System.out.println("2. Iterate through all elements in an array list.");
            for (String element : list_Strings) {
                System.out.println(element);
            }
            // Print the list
            System.out.println(list_Strings);
            // Now insert a color at the first and last position of the list
            System.out.println("3. Insert an element into the array list at the first and last position.");
            list_Strings.add(0, "Queen of Hearts");
            list_Strings.add(6, "King of Diamonds");
            // Print the list
            System.out.println(list_Strings);
            System.out.println("4. Retrieve an element, at a specified index, 1st and 3rd from a given array list.");
            // Retrive the first and third element
            String element = list_Strings.get(0);
            System.out.println("First element: "+element);
            element = list_Strings.get(2);
            System.out.println("Third element: "+element);
            // Print the list
            System.out.println(list_Strings);
            System.out.println("5. Update a specific array element, 10 of Hearts, by given element.");
            // Update the third element with "Ten of Hearts"
            list_Strings.set(2, "Ten of Hearts");
            // Print the list again
            System.out.println(list_Strings);
            System.out.println("6. Remove the third element from an array list.");
            // Remove the third element from the list.
            list_Strings.remove(2);
            // Print the list again
            System.out.println("After removing third element from the list:\n"+list_Strings);
            // Search the value Red
            System.out.println("7. Search an element in an array list, Queen of Hearts.");
            if (list_Strings.contains("Queen of Hearts")) {
                System.out.println("Found the element");
            } else {
                System.out.println("There is no such element");
            }
            System.out.println("8. Sort a given array list.");
            System.out.println("List before sort: "+list_Strings);
            Collections.sort(list_Strings);
            System.out.println("List after sort: "+list_Strings);
            System.out.println("9. Shuffle elements in an array list.");
            System.out.println("List before shuffling:\n" + list_Strings);
            Collections.shuffle(list_Strings);
            System.out.println("List after shuffling:\n" + list_Strings);
            System.out.println("10. Reverse elements in an array list.");
            System.out.println("List before reversing :\n" + list_Strings);
            Collections.reverse(list_Strings);
            System.out.println("List after reversing :\n" + list_Strings);
            System.out.println("11. Swap two elements in an array list.");
            //Swapping 1st(index 0) element with the 3rd(index 2) element
            Collections.swap(list_Strings, 0, 2);
            System.out.println("Array list after swap:");
            for(String b: list_Strings){
                System.out.println(b);
            }
            System.out.println("12. Extract a portion of an array list. ");
            System.out.println("Original list: " + list_Strings);
            List<String> sub_List = list_Strings.subList(0, 3);
            System.out.println("List of first three elements: " + sub_List);
            System.out.println("13. Replace the second element of a ArrayList with the specified element.");
            System.out.println("Original array list: " + list_Strings);
            String new_card = "Ten of Clubs";
            list_Strings.set(1,new_card);
            int num=list_Strings.size();
            System.out.println("Replace second element with 'Ten of Clubs'.");
            for(int i=0;i<num;i++){
                System.out.println(list_Strings.get(i));
            }
            System.out.println("14. Empty an array list.");
            System.out.println("Original array list: " + list_Strings);
            list_Strings.removeAll(list_Strings);
            System.out.println("Array list after remove all elements "+ list_Strings);
            System.out.println("15. Test an array list is empty or not.");
            System.out.println("Checking the above array list is empty or not! " + list_Strings.isEmpty());
            System.out.println("16. Copy one array list into another.");
            list_Strings.add("Two of Clubs");
            list_Strings.add("Two of Spades");
            System.out.println("List1: " + list_Strings);
            List<String> list2 = new ArrayList<String>();
            list2.add("Five of Diamonds");
            list2.add("Five of Clubs");
            System.out.println("List2: " + list2);
            // Copy List2 to List1
            Collections.copy(list_Strings, list2);
            System.out.println("Copy List2 to List1,\nAfter Collections.copy:");
            System.out.println("List1: " + list_Strings);
            System.out.println("List2: " + list2);
            System.out.println("17. Compare two array lists containing same elements");
            //Storing the comparison output in ArrayList<String>
            ArrayList<String> c3 = new ArrayList<String>();
            for (String e : list_Strings)
                c3.add(list2.contains(e) ? "Yes" : "No");
            System.out.println(c3);
            System.out.println("18. Trim the capacity of an array list the current list size.");
            ArrayList<String> c1= new ArrayList<String>();
            c1.add("Ace of Clubs");
            c1.add("Ace of Hearts");
            c1.add("Ace of Spades");
            c1.add("Ace of Diamonds");
            c1.add("Queen of Hearts");
            System.out.println("Original array list: " + c1);
            System.out.println("Let's trim to size the above array: ");
            c1.trimToSize();
            System.out.println(c1);
            System.out.println("Original array list: " + c1);
            System.out.println("Let trim to size the above array: ");
            c1.trimToSize();
            System.out.println(c1);
            System.out.println("19. Increase the size of an array list to 7. ");
            System.out.println("Original array list: " + c1);
            //Increase capacity to 50
            c1.ensureCapacity(50);
            c1.add("Five of Hearts");
            c1.add("Five of Spades");
            System.out.println("New array list: " + c1);
            System.out.println("20. Clone an array list to another array list.");
            System.out.println("Original array list: " + c1);
            ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
            System.out.println("Cloned array list: " + newc1);
            System.out.println("21. Join two array lists. ");
            ArrayList<String> cards1= new ArrayList<String>();
            cards1.add("Six of Clubs");
            cards1.add("Six of Diamonds");
            cards1.add("Six of Spades");
            cards1.add("Six of Hearts");
            System.out.println("List of first array: " + c1);
            ArrayList<String> cards2= new ArrayList<String>();
            cards2.add("Two of Clubs");
            cards2.add("Two of Diamonds");
            cards2.add("Two of Spades");
            cards2.add("Two of Hearts");
            System.out.println("List of second array: " + cards2);

            // Let's join above two list
            ArrayList<String> a = new ArrayList<String>();
            a.addAll(cards1);
            a.addAll(cards2);
            System.out.println("New array: " + a);
            System.out.println("22. Print all the elements of an arrayList using the position of the elements.");
            System.out.println("\nOriginal array list: " + a);
            System.out.println("\nPrint using index of an element: ");
            int no_of_elements = a.size();
            for (int index = 0; index < no_of_elements; index++){
                System.out.println(a.get(index));
            }
        }
}
