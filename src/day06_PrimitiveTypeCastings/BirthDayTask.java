package day06_PrimitiveTypeCastings;

public class BirthDayTask {

    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String month = "April";
        int birthYear = 1995;
        int monthNumber = 4;

        //name was born on month/day/year.
        System.out.println(name + " was born on " + month + " " + birthDay + "th, " + birthYear + ".");
        //Or it can be written as:
        System.out.println(name + " was born on " + "0" + monthNumber + "/" + birthDay + "/" + birthYear + ".");

        //My favorite book is "bookName"
        String bookName = "Rich Dad and The Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\"");
        // Or it can be written as :
        System.out.println("My favorite book is " + "\"" + bookName + "\"");

 /* Task:
    1. Create a class named BirthDay and create the following variable name, birthDay (int), birthMonth(String), birthYear(int)
        use concatenation to display the birthday of the person

        if name = "John"
           birthDay = 25
           birthMonth = "April"
           birthYear + 1995;
  */





    }




}
