package day23_CustomMethods_Void;

public class CustomMethodsWithParametersTask {

    // oddOrEven(); // the method demands additional info to complete its task
    public static void main(String[] args) {
        oddOrEven(10);

        System.out.println("-----------------------------------------");

        ageOfPerson(1995);

        System.out.println("-----------------------------------------");

        printNumbers(1000, 2000);

    }

    // Create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if(number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }

    // Create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: " + age);
    }

    // Create a function that can print all the numbers between X and y
    public static void printNumbers(int x, int y){

    }
}
