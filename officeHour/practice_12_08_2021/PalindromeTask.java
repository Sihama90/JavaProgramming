package practice_12_08_2021;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {


  /*
                       Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String result = "";

        for (int i = word.length() -1; i >= 0; i++) {
            result += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);
             System.out.println(isPalindrome);

        System.out.println("==============================================================");

        if (result.equalsIgnoreCase(word)){
                    System.out.println(word+" is a palindrome");
                }else{
                    System.out.println(word+" is NOT a palindrome");
                }

        
    }


}




