package day04_Variables;

public class CircleTask {

    public static void main(String[] args) {

        // PI, radius, diameter, area, perimeter

        double PI = 3.14;  // - PI is always 3.14 in math
        double radius = 3.5;
        double diameter = radius * 2; // 3.5 * 2  - finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; //3.5 * 3.14  - finds the area of the circle
        double perimeter = diameter * PI; //3.5 * 2 * 3.14  - finds the perimeter of the circle

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

/* Task:
    3. Create a class named circle, write a program that can calculate the area & perimeter of and given Circle PI,
       radius, area, diameter, than convert kg (int) to pound (double)

         Hints: PI = 3.14
         area = radius * radius * PI
         Perimeter = 2 * radius * PI
 */


    }





}
