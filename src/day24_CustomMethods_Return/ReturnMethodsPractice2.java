package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {

    // First: Create a function that can calculate the grade

    //String str1 = grade(95);

    /*
    Second: check the grade:
            'A' ===> Excellent
            'B' ===> Great
            'C' ===> Good
            'D' ===> Passed
            'F' ===> Failed
     */

    public static void grade(int score){
        String result = "";
        if(score < 0 || score > 100){
            result = "Invalid";
        }else{ // valid
            //result = (score >= 90)? :(score >= 80)? :(score >= 70)? :(score >= 60)? "D" : "F";
        }
    }



}
