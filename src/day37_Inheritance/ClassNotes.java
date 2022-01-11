package day37_Inheritance;

public class ClassNotes {

/*
    OOP Inheritance: to build IS A relation between classes (parent and child,  super and sub)

    easiest way to get rich ===> extends

    child class (sub class): can inherit all the variables & methods (visible) from the parent class

    parent class (super class): can not inherit anything from child class. conatin all the common features that are meant to be inherited

    Advantages:
    less codes
    improves the re-usability
            clean
    less memory usage
    easy to maintain

    Class A  extends  Class B

    one class only extends one class
    one class can be extended by multiple classes

this keyword: refers to the instances. Current class
	this. : calls instance variables & instance methods
	this() : calls the constructor of current class

super keyword: referst to the instances. parent class
	super. :calls instance variables & instance methods of super class
	super() : calls the constructor of parent class

    Constructor calls in inheritance:
            1. Child class MUST call parent class' constructor
            2. Parent class' default constructor is always called implicitly in child class
            3. Parent class' constructor with argument need to be called explicitly


    Person
            name, age, gender


    EmployeeTask


    Employee extends Person:
    name, age, id, gender, jobTitle, salary
    work(), toString()


    Tester extends Employee
    creatingTicket()


    Developer extends Employee
    fixBugs()


    Teacher extends Employee
    teaching()


    Driver extends Employee
    driving()

    ScrumMaster extends Employee
	....

    Student extends Person:


    Multi Level Inheritance:

    class Person{ // person: a
        a
    }

    class Employee extends Person{ // employee: a, b
        b
    }

    class Tester extends Employee{ //tester: a, b, c
        c
    }

    class ManualTester extends Tester{ // namually tester: a, b, c, d
        d
    }

    Hierarchical inheritance:

    class Phone{
        a
    }

    class Iphone extends Phone{ // iphone: a, b.   //Iphone IS A Phone
        b
    }

    class Samsung extends Phone{ // samsung: a, c   //Samsung IS A Phone
        c
    }

    class LG extends Phone{ //LG: a d 			// LG IS A Phone
        d
    }

    class Nokia extends Phone{ //Nokia: a, e
        e
    }

    A {
        a
    }

    B extends A{ // B: ab
        b
    }

    C extends B{  //C: abc
        c
    }

    D extends C{ //D: abcd
        d
    }

    class X{
        x
    }

    class Y extends X, Z{
        y
    }

    class Z{
        z
    }

    Task:
    Phone
            ScrumTeam

*/

}
