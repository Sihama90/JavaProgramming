package day14_String;

public class StringMethod3 {

    public static void main(String[] args) {
        //substring(beginning index, ending index)

   String word = "Cydeo School";
   //             0123456789... this is how the numbering index starts.
        word.substring(0,4);
        //String brand
        String brand = word.substring(0, 4 + 1); // This
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        System.out.println("-------------------------------------------------------------------------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); // "Java"
        System.out.println(s1);

        String s2 = word2.substring(word2.indexOf(word2.indexOf(" ")+1), word2.lastIndexOf(" ")); // "Programming"
        System.out.println(s2);

        String s3 = word2.substring(word2.lastIndexOf(" ")+1); // "Language"
        System.out.println(s3);

        System.out.println("-----------------------------------------------------------");

        String word3 = "Python C# Ruby";

        String s4 = word2.substring(0, word2.indexOf(" ")); // "Python"
        System.out.println(s1);

        String s5 = word2.substring(word2.indexOf(word2.indexOf(" ")+1), word2.lastIndexOf(" ")); // "C#"
        System.out.println(s2);

        String s6 = word2.substring(word2.lastIndexOf(" ")+1); // "Ruby"
        System.out.println(s3);












    }




}
