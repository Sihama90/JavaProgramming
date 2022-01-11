package day15_ForLoop;

public class StringMethodsNotes {

    public static void main(String[] args) {

        //Example of isEmpty Method:
       String str = " ";
       boolean r = str.isEmpty();
        System.out.println(r); // Prints false because spaces count as characters in isEmpty Method.

        System.out.println("--------------------------------------------");

        //Example of isBlank Method:
        String str1 = "   ";
        boolean r1 = str1.isBlank();
        System.out.println(r1); // Prints true because spaces do Not count as characters in isBlank Method.

        System.out.println("--------------------------------------------");

        //Example of equals Method: (Can Not ignore case sensitivity when comparing characters)
        String s3 = "CYDEO";
        String s4 = "cydeo";
        System.out.println(s3.equals(s4)); // Prints false

        System.out.println("--------------------------------------------");

        //Example of equalsIgnoreCase Method: (Ignores the case sensitivity when comparing characters)
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equalsIgnoreCase(s2)); // Prints true

        System.out.println("--------------------------------------------");

        //Examples of contains Method:
        String sentence = "My favorite programming language is Java";
        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava); // Prints true

        boolean hasJava2 = sentence.contains("java");
        System.out.println(hasJava2); // Prints false (because it's case-sensitive)

        //To ignore case sensitive
        boolean hasJava3 = sentence.toLowerCase().contains("java");
       // System.out.println(hasJava3.contains("java")); // Prints true (because toLowerCase for string was used)

        //Another way to ignore case-sensitive
        boolean hasJava4 = sentence.toUpperCase().contains("JAVA");
        //
      //System.out.println(hasJava4.contains("JAVA")); // Prints true (because toUpperCase for string was used)

        boolean hasCSharp =sentence.contains("C#");
        System.out.println(hasCSharp); // Prints false








    }






}
