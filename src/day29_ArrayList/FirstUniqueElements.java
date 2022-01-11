package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {

        //THIS IS AN INTERVIEW TASK!
        //To use ArrayList class must first import it from: import java.util.ArrayList;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);

        // To find the unique number(s) we need to find the frequency of each element using for each loop
        for (Integer each : list) {
           // To find the frequency of each element from the Array List
            int frequency = 0;
            for (Integer element : list) {
                if(element == each){
                    frequency++;
                }
            }
            // To find the frequency of one element from the Array List
            if(frequency == 1){
                System.out.println(each);
                break;
            }

        }






    }

}
/*
1. Write a program that can return the first unique elements from an arraylist
			Do not use indexOf & lastIndexOf methods
 */












