package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int num1 = 65;
        int num2 = 2;
        int num3 = 3;
        int num4 = 5;
        boolean isDivisible1 = num1 % num2 == 0;
        boolean isDivisible2 = num1 % num3 == 0;
        boolean isDivisible3 = num1 % num4 == 0;

        System.out.println(num1 + " is divisible by 2: " + isDivisible1);
        System.out.println(num1 + " is divisible by 2: " + isDivisible2);
        System.out.println(num1 + " is divisible by 2: " + isDivisible3);


/* Task:
   2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2,
      3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */





    }
}
