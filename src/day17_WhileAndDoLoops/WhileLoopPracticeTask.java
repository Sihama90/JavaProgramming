package day17_WhileAndDoLoops;

import java.util.*;

public class WhileLoopPracticeTask {

    public static void main(String[] args) {

        //username: "Cydeo"
        //password: "Cydeo123"

        //while(invalid && hasAttempts

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts > 1) {
                    System.out.println("Incorrect username or password, please re-enter");

                } else {
                    System.out.println("This is you final attempt!");
                    u = scan.next();
                    System.out.println("Enter your password:");
                    p = scan.next();
                    attempts--;
                }
                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("Your account is locked.");
                }


            }
            scan.close();


/*
    Task:
    Write a code for log-in function of the Cydeo Application, assume that you cr
 */


        }


    }


}