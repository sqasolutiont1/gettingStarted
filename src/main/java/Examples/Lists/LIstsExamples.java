package Examples.Lists;

import java.util.ArrayList;
import java.util.List;

public class LIstsExamples {
    public static void main(String[] args) {
    }

    private void creatreList(){

        // Creating a list
        List<Integer> l1
                = new ArrayList<Integer>();

        // Adds 1 at 0 index
        l1.add(0, 1);

        // Adds 2 at 1 index
        l1.add(1, 2);
        System.out.println(l1);

        // Creating another list
        List<Integer> l2
                = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1);

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);
    }

    private void addToLIst(){
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }

    private void changeTheLIst(){
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "Geeks");

        System.out.println("Initial ArrayList " + al);

        al.set(1, "For");

        System.out.println("Updated ArrayList " + al);
    }

    private void removeFromLIst(){
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(
                "Initial ArrayList " + al);

        al.remove(1);

        System.out.println(
                "After the Index Removal " + al);

        al.remove("Geeks");

        System.out.println(
                "After the Object Removal " + al);
    }

    private void ineratingTheLIst(){
        List<String> al
                = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}