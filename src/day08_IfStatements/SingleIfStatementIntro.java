package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {


        // Below are examples for Single if statements (used for one possible outlook if & else)

        int number = 300;

        boolean evenNumber = number % 2 == 0;

        boolean oddNumber = !evenNumber;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        if (oddNumber) {
            System.out.println(number + " is odd number");
        }

        System.out.println("--------------------------------------------------------");

        int n = 200;
        // positive
        if (n > 0) { //if the n is grater than zero, then it's positive
            System.out.println(n + " is positive");
        }
        // negative
        if (n < 0) { //if the n is lesser than zero, then it's negative
            System.out.println(n + " is negative");
        }
        //zero
        if (n == 0) { //if the n is equal to 0, then it's zero
            System.out.println(n + " is zero");
        }


    }

}
