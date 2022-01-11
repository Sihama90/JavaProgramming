package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); // Should would type - Java Programming - press Enter

        System.out.println("Enter you building number: ");
        String buildingNumber = scan.next(); // 7925A

        scan.nextLine(); // use the nextLine method only if it doesn't give a space to type the answer.
        System.out.println("Enter your Street name: ");
        String streetName = scan.nextLine(); // Must press Enter key after typing street name in the console.

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine(); // Must press Enter key after typing city name in the console.

        System.out.println("Enter your state: ");
        String state = scan.nextLine(); // Must press Enter key after typing state name in the console.

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next(); // Must press Enter key after typing the zip code in the console.

        scan.nextLine(); // use the nextLine method only if it doesn't give a space to type the answer.
        System.out.println("Enter your country name: ");
        String country = scan.nextLine();



        System.out.println(fullName + " " + buildingNumber + " " + streetName + " " + cityName + "\n" + state + ", " +
                zipCode + " " + country);


        scan.close();



/*
  Task:
  1. Enter your full name (nextLine())
  2. Enter your building number (next())
  3. Enter your Street name (nextLine())
  4. Enter your city name (nextLine())
  5 Enter your state (next())
  6. Enter your zip code  (next())
 */





    }





}
