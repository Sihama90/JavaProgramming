package day04_Variables;

public class SalaryCalculatorTask {

    public static void main(String[] args) {

        //example below calculate a person's salary:
        //hourlyRate, weeklyHours, numberOfWeeks

        // The numbers can be changed
        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary); the print statement can not have "" around the variable in order for it to print.

        //soutv is the shortcut to type the print statement with a variable.
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }




}
