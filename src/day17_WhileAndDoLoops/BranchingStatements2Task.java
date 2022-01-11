package day17_WhileAndDoLoops;

public class BranchingStatements2Task {

    public static void main(String[] args) {

        for (int i = 'A'; i <= 'E' ; i++) {
            if(i == 'C'){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------");
        // Print all number 1 ~ 10
        for (int i = 1; i <= 10 ; i++) {
            if(i == 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        // Print all even numbers 1 ~ 10 (skip the odd numbers)
        for (int i = 1; i < 11 ; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------");



    }




}
