package day07_Operators;

public class CastingsTask {

    public static void main(String[] args) {

        /* Implicit Casting definition: casting smaller type to larger
           Explicit Casting definition: casting larger type to smaller
         */

        float averageScore = 20.5f;

        byte num1 = (byte)averageScore; // explicit casting
        short num2 = (short)averageScore; // explicit casting
        int num3 = (int)averageScore; // explicit casting
        long num4 = (long)averageScore; // explicit casting
        float num5 = averageScore; // no casting (the gray over num5 means that no explicit casting is necessary)
        double num6 = averageScore; // implicit casting (the gray over num6 means that no explicit casting is necessary)

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

/*  Task:
    1. Create a class named Castings
              1.1 declare a variable of float named averageScore and initialize it to 20.5
              1.2 declare teh following variables and assign averageScore to each of them:
                               byte num1;
                               short num2;
                               int num3;
                               long num4;
                               float num5;
                               double num6;
 */





    }




}
