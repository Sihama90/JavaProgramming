package practice_12_01_2021;

public class CodilityTest {


    public static void main(String[] args) {

    String str = "abc";
    str = "def";
        System.out.println(str);

    int number = 45;
    String result = "";

    // Using concatenation to connect the string +=

    if(number % 2 == 0){
        result += "Codility"; // result = ""; // will N ot add "Codility" because number (45) is not divisible by 2
    }
    if(number % 3 == 0){
        result += "Test"; // result = "Test";
    }
    if(number % 5 == 0){
        result += "Coders"; // result = "Test" + "Coders";
    }
        System.out.println("result = " + result); // CodilityTestCoders


    }



}
