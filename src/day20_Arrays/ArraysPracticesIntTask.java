package day20_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysPracticesIntTask {

    public static void main(String[] args) {
        
        // Store the elements: 10, 20, 50, 70
        int[]numbers = {10, 20, 50, 70}; // size is 4
        System.out.println(Arrays.toString(numbers)); // To print all the numbers.
        
        System.out.println("--------------------------------------------------------");
        
        //create a variable that can contain 5 scores
        int[] scores = new int[5]; // [0, 0, 0, 0, 0]
        scores[1] = 85;
        scores[scores.length -1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores)); // It will print in this order -> [65, 85, 55, 75, 95]

        System.out.println("-------------------------------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                // index:             0           1          2        3       4      5        6        7          8
                "October", "November", "December"};
        //        9           10          11
        
        System.out.println(months[0]); // January
        System.out.println(months[1]); // February
        System.out.println(months[2]); // March
        System.out.println(months[3]); // April
        System.out.println(months[4]); // May
        System.out.println(months[5]); // June
        System.out.println(months[6]); // July
        System.out.println(months[7]); // August
        System.out.println(months[8]); // September
        System.out.println(months[9]); // October
        System.out.println(months[10]); // November
        System.out.println(months[11]); // December
        
        // An easier way to print all the months using loops

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
            
        }
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = months.length-1; i >= 0; i++) { // i: repesents the index numbers of array starting from last index
            System.out.println(months[1]);
            
        }





    }
    
    
    
    
    
}
