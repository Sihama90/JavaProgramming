package day15_ForLoop;

public class AlphebetTask {

    public static void main(String[] args) {

        //Example using For Loop to print A ~ Z (use char or ascii table)
        for(int i = 65; i <= 90; i++){ // for using ascii table number
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------------------------");

        for(char i = 'A'; i <= 'Z'; i++){ // for using ascii table number
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------------------------");

        for(char i = 'a'; i <= 'z'; i++){ // for using ascii table number
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------------------------");

        for(char i = 'Z'; i >= 'A'; i--){ // for using ascii table number
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------------------------");

        for(char i = 'z'; i <= 'a'; i--){ // for using ascii table number
            System.out.print(i + " ");
        }

        System.out.println("-----------------------------------------------------------");

        for(char i = 1; i <= 40000; i++){ // for using ascii table number
            System.out.print((char)i + " ");
        }






    }





}
