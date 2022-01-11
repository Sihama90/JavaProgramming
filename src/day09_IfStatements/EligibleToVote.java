package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Sara";
        int age = 21 ;
        String country = "USA citizen";
        boolean isEligible = age >= 18 && country == "USA citizen";

        if (isEligible){
            System.out.println(name + " is eligible to vote");
        }else{
            System.out.println(name + " is Not eligible to vote.");
        }















/* Task:
   4. Write a program that can check if the person is eligible to vote.
 */















    }

















}
