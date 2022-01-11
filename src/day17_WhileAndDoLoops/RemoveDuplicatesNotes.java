package day17_WhileAndDoLoops;

public class RemoveDuplicatesNotes {

    public static void main(String[] args) {

       String str = "AABBCC";

       String result = "ABC"; // Add here each character that is not already contained
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(result.contains("" + ch)) { // if the result already contains the character
                continue; // skips
            }
            result += ch;

        }
            System.out.println(result);







    }




}
