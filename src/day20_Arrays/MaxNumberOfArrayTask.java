package day20_Arrays;

public class MaxNumberOfArrayTask {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; //
        // To create the array to find the max num in reverse: look at video
        // To create the array to find the max num: numbers.fori + enter
        for (int i = 0; i < numbers.length; i++) { // This condition: if  there is element in the array that is greater than the
            // current max number
            if (numbers[i] > max) { // assigning greater number to variable max
                max = numbers[i];
            }

        }


        System.out.println(max);

    }





}
