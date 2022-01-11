package day16_ForLoopStringPractice;

public class RemoveDuplicatesTask {

    public static void main(String[] args) {

       String str = "aabbaacc";
       String result = ""; // Add only the characters that are not contained in the above string

        //Can also write it as: for(int i <= 7 ===> i < 8

        for (int i = 0; i < str.length(); i++) { // i: represents all the index numbers of str (starting from 0)
            String ch = "" + str.charAt(i); // represents each Character of str

            System.out.println(ch);

            if(!result.contains(ch)){ // if the character is not contained in the result
                result += ch; // the character will be added to the result
            }
        }


/*
  Task:
  2. Write a program that can remove the duplicated characters from a String
     Example:
              input:
                     AABBCCBC
              Output:
                     ABC
             Hint: You can add each character of the string into another String
             Condition: The character is not contained in the other String yet before you are adding

 */






    }





}
