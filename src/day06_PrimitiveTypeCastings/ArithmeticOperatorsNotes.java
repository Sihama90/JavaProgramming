package day06_PrimitiveTypeCastings;

public class ArithmeticOperatorsNotes {

    public static void main(String[] args) {

      /*

      Arithmetic Operators

      Name                Operator   Purpose & Notes                                    Example    Result

      Addition               +       Adds one value to another                          10 + 5       15
      Subtraction            -       Subtracts one value from another                   10 - 5       5
      Division               /       Divides into two values                            10 / 5       2
      Multiplication         *       Multiplies two values                              10 * 5       50
      Modulus                %       Divides two values and returns the remainder       10 % 5       1


                     integer / integer ====> integer
                     decimal / integer ====> decimal
                     integer / decimal ====> decimal
                     decimal / decimal ====> decimal
       */

        //Example for Addition:
        System.out.println(10 + 5);

        //Example for Subtraction:
        System.out.println(10 - 5);

        //Example for Division:
        System.out.println(10 / 5); // In order to get the answer as a decimal, one of the numbers must be written as a
                                    // decimal
        //Example for Division to get answer with a decimal
        System.out.println(10.0 / 5);

        // or it can also be written as
        System.out.println(10 / 5.0);

        // or it can be written as:
        System.out.println(10.0 / 5.0);

        // or it can be written as:
        System.out.println(10d / 5); // can also be capital D

        // or it can be written as:
        System.out.println(10 / 5d); // Can also be capital D

        //Example for Multiplication:
        System.out.println(10 * 5);

        //Example for Remainder:
        System.out.println(10 % 5);

    }


}
