package day10_NestedIfStatements;

public class NameOfDay {

    public static void main(String[] args) {

        int n = 5; //1 ~ 7
        if(n == 5){
            System.out.println("Monday");
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        //if (?) must be after the condition ( )?
        // else if (:) must be before the condition :( )

        String name = (n == 1)? "Monday" :(n == 2)? "Tuesday" :(n== 3)? "Wednesday :(n == 4)?" + "Thursday"
                :(n == 5)? "Friday" :(n == 6)? "Saturday" :"Sunday";

        System.out.println(name);




    }

}
