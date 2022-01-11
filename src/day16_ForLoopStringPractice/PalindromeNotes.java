package day16_ForLoopStringPractice;

public class PalindromeNotes {

    public static void main(String[] args) {

        String word = "Level"; // Can use any word to see if it's palindrome or not.
        String reversed = "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed); // Using Ignore Case Method
        System.out.println("isPlaindrome = " + isPalindrome);





/*
  Examples of Palindromes (words or names that can be reversed and remain the same)
  1. Anna --> anna
  2. Racecar --> racecar
  3. Level --> level
  4. Dad --> dad
  5. Mom -->mom

  Examples of words that are Not Palindromes
  1. Java --> avaj
  2. Buss --> ssub
  3. Word --> drow
  4. Father --> rehtaf
  5. Mother --> rehtom


 */







    }





}
