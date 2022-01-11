package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("cydeo", "school");

        System.out.println("-------------------------------------------------------------------------------");

        domain("Cydeo.School@cydeo.com");

    }

    // 1. Create a method that can display the initials of the person.
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    // 2. Create a method that can display the domain of the email. domain()
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".") );
        System.out.println("domain = " + domain);
    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name = "";

        if(number >= 1 && number <= 12){
            name = (number == 1)? "January" :(number == 2)? "February" :(number == 3)? "March" :(number == 4)? "April"
                    :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "August"
                    :(number == 9)? "September" :(number == 10)? "October" :(number == 11)? "November" : "December";

        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int day){
        String name = "";
        if(day >= 1 && day <= 7){
            name = (day == 1)? "Monday" :(day == 2)? "Tuesday" :(day == 3)? "Wednesday" :(day == 4)? "Thursday"
                    :(day == 5)? "Friday" :(day == 6)? "Saturday" :"Sunday";

        }else{
            name = "Invalid";
        }
        System.out.println("Name of day = " + day);
    }


    // 5. Create a method that can print how many days a month has
    public static void daysInMonth(int number, int year){

    }

    // ageGroups (int age)
/*
  1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */

}
