package day10_NestedIfStatements;

public class TernariesInfo {

    public static void main(String[] args) {

       int n = 100;
       if(n%2 == 0){
           System.out.println("Even"); // String
       }else{
           System.out.println("Odd"); // String
       }

        System.out.println("--------------------------------------------------------");
        //int n = 100;

        String result1 = (n%2 == 0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("--------------------------------------------------------");


        /*
        if(age >= 21){
        System.out.println("Eligible");
        {else{
        System.out.println("Not eligible");
        }
         */







    }


}
