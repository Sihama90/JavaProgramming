package day17_WhileAndDoLoops;

import java.util.*;

public class EligibleToVoteTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = scan.nextInt();
        while(!(age >= 1 && age <= 120)){
            System.out.println("Invalid entry, please re-enter");
            age = scan.nextInt();

        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid entry, please re-enter");
            System.out.println("Are you a US citizen? yes/no");
            answer = scan.next().toLowerCase();
        }
        if(age >= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
            System.out.println("");
        }


     scan.close();




    }



}
