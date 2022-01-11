package practice_12_01_2021;

public class PatientInfoTask {

    public static void main(String[] args) {

/*
   Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
 */

    String name = "John";
    int age = 38;
    char gender = 'M';
    String dateOfBirth = "12/01/1983";
    boolean isMarried = true;
    String phoneNumber = "(123)456-7890";
    boolean hasInsurance = true;
    String Employer = "Cydeo";
    double copayWithInsurance = 20.80;
    double copayWithOutInsurance = 250.00;

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Date Of Birth = " + dateOfBirth);
        System.out.println("is Married = " + isMarried);
        System.out.println("Phone Number = " + phoneNumber);
        System.out.println("has Insurance = " + hasInsurance);
        System.out.println("Employer = " + Employer);
        System.out.println("Copay with Insurance = " + copayWithInsurance);
        System.out.println("Copay with out Insurance = " + copayWithOutInsurance);

        System.out.println("====================Escape Sequences===================");

        System.out.println("\tName: " + name + "\n\tAge: " + age + "\n\tGender: " + gender + "\n\tDate Of Birth: " +
                dateOfBirth + "\n\tis Married: " + isMarried + "\n\tPhone Number: " + phoneNumber +
                "\n\thas Insurance: " + hasInsurance + "\n\tEmployer: " + Employer + "\n\tCopay with Insurance: " +
                 copayWithInsurance + "\n\tCopay with out Insurance: " + copayWithOutInsurance);

        if(hasInsurance){
            System.out.println("copay with Insurance");
        }else{
            System.out.println("copay with out Insurance");
        }








    }




}
