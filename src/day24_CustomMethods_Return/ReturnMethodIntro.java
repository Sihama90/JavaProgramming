package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {

       String str = "Java";

    }

    public static void Stringreverse2(String str){

        String reverse2 = "";

        for(int i = str.length()-1; i >= 0; i--){ // "Java"
            reverse2 += str.charAt(i);
        }
        //return reverse2;
    }





}
