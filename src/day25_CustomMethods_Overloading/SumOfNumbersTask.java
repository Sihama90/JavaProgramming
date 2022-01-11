package day25_CustomMethods_Overloading;

public class SumOfNumbersTask {

    public static void main(String[] args) {

        // sum of 10 and 20
        int sum1 = sumOfNumbers(10, 20);

        // sum of 10, 20, 30
        int sum2 = sumOfNumbers(10, 20, 30);

        // sum of 10, 20, 30, 40
        int sum3 = sumOfNumbers(10, 20, 30, 40);

    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

/*
    Tasks
	Task1:
        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers

*/

}
