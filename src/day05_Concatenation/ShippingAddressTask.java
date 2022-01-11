package day05_Concatenation;

public class ShippingAddressTask {

    public static void main(String[] args) {


      // Example of how to print one by one
        String name = "James King";
        String buildingNumber = "118218";
        String streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22831A";

        System.out.println("name");
        System.out.println("buildingName");
        System.out.println("streetName");
        System.out.println("city");
        System.out.println("state");
        System.out.println("zipCode");

        System.out.println("------------------------------------------------------------------");

        //Example of how to print using concatenation
             String name2 = "James King";
             String buildingNumber2 = "118218";
             String streetName2 = "Jones Branch Dr";
             String city2 = "McLean";
             String state2 = "VA";
             String zipcode2 = "22831A";

             String address = name2 + "\n"+ buildingNumber2 + " " + streetName2 + "\n" + city2 + " " + state2 + ", " + zipcode2;

        System.out.println(address);

        System.out.println("----------------------------------------------------------------------------------");

        // Example of how to declare multiple variables ( using one String for all the info)
        String name3 = "James King",
        buildingNumber3 = "118218",
        streetName3 = "Jones Branch Dr",
        city3 = "McLean",
        state3 = "VA",
        zipCode3 = "22831A";

        String adsress = name3;
        System.out.println(address);

/* Task:
   1. Create a class called ShippingAddress.java
   2. Declare the following variables:
           1. name
           2. buildingName
           3. streetName
           4. city
           5. state
           6. zipcode
 */

/*
        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);

*/






    }






}
