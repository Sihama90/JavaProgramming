package day36_Inheritance.Employee;

public class Employees {

    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

    public void setInfo(String name, char gender, int age, String jobTitle, int id, double salary, String companyName){

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;

    }
    /*
    public void (){
        System.out.println(name + " is");
    }
    public void (){
        System.out.println(name + " is");
    }

    public void (){
        System.out.println(name + " is");
    }
    public void (){
        System.out.println(name + " is");
    }



     */
    public String toString() {
        return "Employees{" +
                "name ='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", jobTitle=" + jobTitle +
                ", id='" + id + '\'' +
                ", salary ='" + salary + '\'' +
                ", companyName = " + companyName + '\'' +
                '}';
    }
 /*
    Employee:
        name, gender, age, jobTitle, id, salary, companyName
        setInfo(), work(), toString()


    Tester

    Developer

    Driver

    Teacher
  */

}
