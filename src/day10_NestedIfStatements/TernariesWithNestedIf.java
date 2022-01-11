package day10_NestedIfStatements;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

      int s = 85;
      if(s >= 0 && s <= 100){
          if(s >= 60){
          }else {
              System.out.println("Passed");
          }
      }else{
          System.out.println("Invalid Score");
      }

        System.out.println("--------------------------------------------------------------------------------------");

      /* Below is an example of Ternaries with Nested If Statements (but it's not recommended to use because it's
         harder to read so use the above example.
       */
        String result = (s>= 0 && s <= 100)? "Passed" : (s >= 60)? "Failed" : "Invalid Score";

        System.out.println(result);




    }


}
