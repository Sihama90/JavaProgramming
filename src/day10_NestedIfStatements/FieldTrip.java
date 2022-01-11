package day10_NestedIfStatements;

public class FieldTrip {

    public static void main(String[] args) {

       int grade = 2;
       String location = "";
       int groupNumber = 3;
       String nameOfTeacher = "";
       String teacher = "";

       if(grade >= 1 && grade <= 6){
           if(grade == 1){
               location = "Apple orchard";
               groupNumber = 3;
               teacher = "Ms. Smith";
           }else if(grade == 2){
               location = "";
               //groupNumber = "";
               teacher = "";

           }

        }else {

       }
           System.out.println("Invalid Grade");

        System.out.println("location - " + location);
        System.out.println("number of groups - " + groupNumber);
        System.out.println("teacher in charge - " + teacher);

        /* or you can concatenate it together like below

         */









    }


}
