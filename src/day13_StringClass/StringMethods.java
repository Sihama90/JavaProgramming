package day13_StringClass;

public class StringMethods {

    public static void main(String[] args) {

      String word = "Cydeo";

      char thirdChar = word.charAt(2); // to print 3rd character must put 2 because index number start with 0 not one.
        System.out.println("thirdChar = " + thirdChar);

      char ninthChar = word.charAt(4);
        System.out.println("ninthChar = " + ninthChar);

    System.out.println("-------------------------------------------------------");

        String s1 = "Batch 25 is the best batch.";

        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);

      char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------------------------------------------");

        String str = "wooden spoon";
        str.toUpperCase(); // This will print "wooden spoon"  as typed above. (All letters lower case).
        System.out.println(str);
        str = str.toUpperCase(); // This print "WOODEN SPOON" (All capitalized letters).

        String sentence = "Today is a great day to lean programing language.";
        sentence = sentence.toUpperCase(); // This will print the sentence inside the quotes All upper case.
        System.out.println(sentence);







    }






}
