package day20_Arrays;

import java.util.Arrays;

public class ClassmatesTask {

    public static void main(String[] args) {

       String[] classmates = {"Sunila Imran", "Ruth Galvan", "Rim Anito", "Alonso Cruz", "Riza Aliyev",
               "Elvin Karimli", "Shanza Khan", "Mariam Bmahmadyar", "Layla Mansour", "Imane Helali"};
                // index:             0           1          2        3       4      5        6        7     8

        for(String each : classmates){
            String initial = each.charAt(0) + "" + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }



        Arrays.sort(classmates);
        System.out.println(Arrays.toString(classmates));
        System.out.println(classmates.length);





/*


        System.out.println(classmates[0]);
        System.out.println(classmates[1]);
        System.out.println(classmates[2]);
        System.out.println(classmates[3]);
        System.out.println(classmates[4]);
        System.out.println(classmates[5]);
        System.out.println(classmates[6]);
        System.out.println(classmates[7]);
        System.out.println(classmates[8]);
        System.out.println(classmates[9]);


/*
  1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */






    }




}
