package day06_PrimitiveTypeCastings;

public class PrimitiveCastingsMyNotes {

    public static void main(String[] args) {

/*
      Primitive Type Casting --> Allows assign one primitive type value to another primitive type.

     * There are two types of primitive type castings:

        (1) IMPLICIT CASTINGS = Casting smaller primitive types to larger primitive types.

                                       Example of Implicit casting: (It's done by Compiler)

     (byte is a smaller primitive type) --> byte a = 25;      short x = 1000; <-- (Short is a larger primitive type than
       than the int primitive type)         int b = a;        long y = (long)x;    the long primitive type)

        (2) EXPLICIT CASTINGS: Casting larger primitive types to smaller primitive types (Opposite of Implicit casting)

                                       Example of Explicit casting: (Not done automatically)

      (int is a larger primitive type --> int a = 100;          long x = 2000;   <--  (long is larger primitive type
       than the byte primitive type)      byte b = (byte) a;    short y = (short) x;  than the short primitive type)


     * Cast Operator is needed to manually convert a value
           int <--- double
           int number;
           double decimalNumber = 32.33;
           number = (int)decimalNumber; <-- Here the decimalNumber variable is converting into an int (integer number).



 */


        /* Primitive :

                 double > flout > long > int > short > byte

        smaller primitive types can be assigned to larger primitive types automatically.

        larger primitive can Not be assigned to larger primitive types automatically. (needs to be done manually)

         */

            //Example of implicit casting
            byte a = 100;
            short b = a; // Implicit casting


      /*In the background compiler is casting byte to short (Compiler able to do the casting automatically because
         byte is a smaller primitive type than short. Therefore, short can contain byte.)
       */

             //Example of Explicit casting
             int x = 55;
             short y = (short)x; // Explicit casting
             // Now  both x = 55 and y = 55

             System.out.println(x + " : " +y);

             //Example of Explicit casting
             long j = 1000000;
             short k = (short)j; //Explicit casting
             // Now both j = 1000000 and k = 1000000

             System.out.println(j + " : " + k); // It will not print 1000000 because short can not hold a number
             // that large.











    }





}
