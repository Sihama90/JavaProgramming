package day09_IfStatements;

public class AgeGroups2 {

    public static void main(String[] args) {

        int age = 160;
        String result = "";

        if(age >= 0 && age <= 150) {

            if (age >= 1 && age <= 2){
                result = "Infant";
            }else if(age >= 3 && age <= 5){
                result = "Toddler";
            }else if(age >= 6 && age <= 9){
                result = "Kid";
            }else if(age >= 10 && age <= 12){
                result = "Pre-Teen";
            }else if(age >= 13 && age <= 17){
                result = "Teenager";
            }else if(age>= 18 && age <= 21){
                result = "Young Adult";
            }else if(age >= 22 && age <= 55 ){
                result = "Adult";
            }else{
                result = "Senior";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
/*
  Task:
  4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */


    }



}
