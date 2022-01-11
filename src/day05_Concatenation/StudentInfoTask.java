package day05_Concatenation;

import javax.lang.model.SourceVersion;

    public class
    StudentInfoTask {

    public static void main(String[] args) {

        String student_name = "Siham"; // can also be typed studentName (camelback)
        int age = 31;
        char gender = 'F';
        String school_name = "Cydeo"; // can also be typed schoolName (camelback)
        String phone_number1 = "(123)345-6789"; // can also be typed phoneNumber (camelback)
        String phone_number2 = "(123)456-7899"; // numbers can not be typed at the beginning of the variable
        boolean isFullTime = true; // can also be typed is_full_time
        double GPA = 2.5;

        //Example printing one by one
        System.out.println("Student Name = " + student_name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("School Name = " + school_name);
        System.out.println("Phone Number1 = " + phone_number1);
        System.out.println("Phone Number2 = " + phone_number2);
        System.out.println("Is Full Time = " + isFullTime);
        System.out.println("GPA = " + GPA);

        System.out.println("---------------------------------------------------------------------------");

        String student_name2 = "Siham"; // can also be typed studentName (camelback)
        int age2 = 31;
        char gender2 = 'F';
        String school_name2 = "Cydeo"; // can also be typed schoolName (camelback)
        String phone_number01 = "(123)345-6789"; // can also be typed phoneNumber (camelback)
        String phone_number02 = "(123)456-7899"; // numbers can not be typed at the beginning of the variable
        boolean isFullTime2 = true; // can also be typed is_full_time
        double GPA2 = 2.5;

        //Example printing using concatenation
        System.out.println("Student Name: " + student_name2 + "\n" + "Age: " + age + "\n" + "Gender: " + gender2 + "\n"
                + "School Name: " + school_name2 + "\n" + "Phone Number: " + phone_number01 + "\n" + "Phone Number: " +
                phone_number02 + "\n" + "Is Full Time: " + isFullTime2 + "\n" + "GPA: " + GPA2);

/* Task:
   2. Create a class called studentInfo, and declare variables for the followings:
               1. student name
               2. age
               3. gender
               4. school name
               5. phone number
               6. full time
               7. GPA
 */





    }





}
