package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {

    String str1 = "     batch 25     ";
    str1 = str1.trim(); // " batch 25"
        System.out.println(str1);

    String str2 = "Cydeo School";

    int n1 = str2.indexOf("h"); // 8
        System.out.println("n1 = " + n1);

    int n2 = str2.indexOf("ool"); // 9
        System.out.println("n2 = " + n2);

    String str3 = "Java Programming language";

    int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);

    int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);

    int n5 = str3.indexOf("ng");
        System.out.println("n5 = " + n5);

    //To find the last character or starting from the right side of the screen.

    int n6 = str3.lastIndexOf("g");
        System.out.println("n6 = " + n6);

        System.out.println("------------------------------------------------------------");


        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a"); // Used to find first A in the string of text.
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a"); // Used to find last A in the string of text.
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a "); // Used to find the second A in the string of text.
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C"); // Used to find the third A in the string of text.
        System.out.println("thirdA = " + thirdA);

        //int fourthA = s.indexOf("ava W"); Second option.
        int fourthA = s.lastIndexOf("av"); // First option used to find the fourth A in the string of text.
        System.out.println("fourthA = " + fourthA);

        //int fifthA = s.indexOf("a W"); Second option.
        int fifthA = s.lastIndexOf(""); // First option used to find the fifth A in the string of text.
        System.out.println("fifthA = " + fifthA);

        //int sixthA = s.indexOf(" "); Second option.
        int sixthA = s.lastIndexOf("aw"); // First option used to find the sixth A in the string of text.
        System.out.println("sixthA = " + sixthA);

        //int seventhA = s.indexOf("a o"); Second option.
        int seventhA = s.lastIndexOf("a "); // First option used to find the seventh A in the string of text.
        System.out.println("seventhA = " + seventhA);
















    }




}
