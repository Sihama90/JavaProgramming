package day18_NestedLoop;

public class NestedLoopIntroNotes {

    public static void main(String[] args) {

       // to print 20 times must repeat for loop 4 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");

        }


        System.out.println("-------------------------------------------------------");

       // Nested Loop : means loop inside another loop (inner & outer loop)
        // one iteration of the outer loop,

        //Simpler way to repeat

        for (int j = 0; j < 4; j++) { // j: 0, 1,, 2, 3
            System.out.println("Wooden Spoon");
            for (int i = 0; i < 5; i++) { // i: 0,1, 2, 3, 4
                System.out.println("Wooden Spoon");

            }
        }

    }





}
