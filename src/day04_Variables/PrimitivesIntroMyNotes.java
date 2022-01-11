package day04_Variables;

public class PrimitivesIntroMyNotes {

    public static void main(String[] args) {


/*  Primitive Data Types:
      - numerical primitives:
          double > float > long > int > byte

    Primitives:
     - int: for integers
     - double: for decimals
     - char: for single characters
     - boolean: true/false

    Non Primitives:
     - String: sequence of characters (String of text), ""
       Example: (123)456-7899
       1234567899 - if written this way you don't need to use String.

    Variables naming rules:
        1. Must be unique
        2. camel care if more than two words
        3. Can Not start with digits
        4. Always starts with lower case letters
        5. Can not be Java reserved words
        6. Can not have special characters other than _ and $
        7. Must be readable, understandable, and make sense (names should be matching with the Data that is assigned)
        8. Each variable can only have one name.

    How to replace variable names?
      Windows:
        1. Ctrl + R
        2. type old variable name
        3. type new variable name
        4. click Replace All
      MAC:
        1. Command + R
        2. type old variable name
        3. type new variable name
        4. click Replace aLL
 */
        //char only accepts single character.
        // #
        //char ch1 = '#';
        //System.out.println("ch1" = + ch1);
        //char ch2 =35;
        //System.out.println("ch2" = + ch2);
        //char ch3 = 35000;
        // System.out.println("ch3" = +ch3);
        //char gender = 'F';
        //char grade = 'A';
        //char YesNo = 'Y';

        //boolean statement can only be true/false. Examples below
        boolean isMarried = true;
        boolean isEmployed = false;
        boolean result = 100 > 300;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("result = " + result);

       // Examples using String
        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name = "Muhtar";
        System.out.println("first_name = " + first_name);
        int num1 = 100; //Numbers cannot be typed as the first character.
        System.out.println("num1 = " + num1);





    }




}
