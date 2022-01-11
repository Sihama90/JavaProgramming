package day17_WhileAndDoLoops;

public class FrequencyOfCharacterTask {

    public static void main(String[] args) {

       String str = "AAABBBC";
       char ch = 'A';

       int frequency = 0; // it's increased by on each time the if statement/condition is true
        // This is a For Loop
        for (int i = 0; i < str.length(); i++) { // i : indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str
            // 'A' == 'A' this is the condition
            if(ch == eachChar){ // if the given ch is matching with the eachChar, then ch is appeared in the string
                frequency++; // can also use frequency += 1; means the same

            }

        }
        System.out.println(frequency);
/*
  Warmup Task:
  1. Write a program that can return the frequency of char from a sTRING
  Ex:
     str = "AAABBBC"
     Ch = 'A'
     Output:
            3
 */






    }




}
