package practice_12_08_2021;

public class SwitchExTask {

    public static void main(String[] args) {

/* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */

        String animal = "CAT";
        String result = "";

        switch(animal){
            case "DOG":
            case "CAT":
                result = "domestic animal";
                break;
            case "Tiger":
                result = "wild animal";
                break;
            default:
              result = "unknown animal";
              break;
        }
        System.out.println(result);




    }




}
