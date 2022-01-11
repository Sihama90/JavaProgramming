package day05_Concatenation;

public class FullNameTask {

    public static void main(String[] args) {

     String first_name = "Siham";
     String last_name = "Abbou";
     int age = 31;
     String job_title = "SDET";
     String company_name = "Cydeo";
     String salary = "120000";

     String full_name = first_name + " " + last_name;

        System.out.println("Full_name = " + full_name);

        // Print Full name of the person is____
        System.out.println("Full name of the person is " + full_name );

        // Print Full name____ is__  years old.
        System.out.println(full_name + " is " + age + " years old. ");
        // Print Full name____ is__ title_____ works at______ as______ and full name' salary.
        System.out.println(full_name + " is " + age + " works as an " + job_title + " at " + company_name + " Company" +
                " and her salary is " + "$" + salary + ".");




    }





}
