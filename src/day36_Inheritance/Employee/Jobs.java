package day36_Inheritance.Employee;

public class Jobs {

    public static void main(String[] args) {

        Tester tester = new Tester();
        //tester.setInfo();
        System.out.println(tester);

        Developer developer = new Developer();
        //developer.setInfo();
        System.out.println(tester);

        Driver driver = new Driver();
        //driver.setInfo();
        System.out.println(driver);

        Teacher teacher = new Teacher();
        //teacher.setInfo();

        System.out.println(teacher);
    }


}
