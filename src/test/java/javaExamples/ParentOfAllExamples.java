package javaExamples;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class ParentOfAllExamples {
    ParentOfAllExamples(){
        System.out.println("This is parent class");
    }

    public void arrayExamplesIteration(){
        int[] integerArray = {10,20,30,40,50,60,70,80,90,100,110,120};
        /**
         * iteration through array.
         * for loop.
         */
        for (int i = 0; i< integerArray.length; i++){
            //System.out.println("This is our element at index: " + i+ " and the value of the element is: "+ integerArray[i]);
        }
        /**
         * foreach
         */
        for (int elementOfArray:integerArray) {
            System.out.println(elementOfArray);
        }
    }

    public void arrUpdateElements(){
        int[] integerArray ={0};
        integerArray[0]= 1;
        System.out.println(integerArray[0]);
    }

    /**
     * PLEASE MAKE SURE THAT ALL THE TASKS RELATED TO TEH LIST WILL BE DONE BY YOU!!!!!!!!!!!!!11111
     */
    public void arrayLists(){
        List<String> list = new ArrayList<>();
        for(int i = 0; i<30; i++){
            list.add(RandomStringUtils.random(10, true, false));
        }
        System.out.println(list);
        /**
         * This is how we are getting values from teh list
         */
        for (String itemFromTheList : list) {
            System.out.println(itemFromTheList);
        }
    }

    public void iterateThroughListInterator(){
        List<String> list = new ArrayList<>();
        for(int i = 0; i<30; i++){
            list.add(RandomStringUtils.random(10, true, false));
        }
        Iterator<String> interator = list.iterator();

        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }

    public void mapsExamples(){
        Map<Integer, String> map = new HashMap<>();
    }

}
