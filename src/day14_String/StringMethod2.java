package day14_String;

import jdk.swing.interop.SwingInterOpUtils;

public class StringMethod2 {

    public static void main(String[] args) {

    String str = "Java is fun, I love learning Java";
        System.out.println("str = " + str);

    String str2 = str.replace("Java" , "Python"); // it creates a new string:
                                                                    // "Python is fun, I love learning Python"
        System.out.println("str2 = " + str2);

    String email = "JohnSmith@yahoo.com";
        System.out.println("email = " + email);

        email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

    String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
    String sentence2 = sentence.replace("Python", "");
        System.out.println("sentence2 = " + sentence2);
    sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);

    String s = "Dog Dog Dog Dog Dog Dog"; // Must use a variable (s) because String is immutable.
    s.replace("Dog", "Cat");
        System.out.println("s = " + s );

    String s2 = "C# is fun, C# is cool";
    s2 = s2.replace("C#", "Java"); // Used to replace only the second C#.
        System.out.println("s2 = " + s2);

    String s3 = "Java";
    s3 = s3.replace("a", "e"); // Used to replace the letter a with letter e.
        System.out.println("s3 = " + s3);

        System.out.println("-----------------------------------------------------------------");

    String result = "Java Java Java" ;
    //result = result.replace("Java", "Python");
    result = result.replaceFirst("Java", "Python");
        System.out.println(result);

    String result2 = "C# is fun, C# is cool";
    //result2 = result2.replaceFirst("C#", "Java");
    //result2 = result2.replaceFirst("a", "o"); // "Jova"
    //result2 = result2.replaceFirst("va", "vo"); // "Javo"
        System.out.println(result2);










    }




}
