package day20_Arrays;

public class ReversedArrayTask {

    public static void main(String[] args) {

        String[] names = {"Sunila Imran", "Ruth Galvan", "Rim Anito", "Alonso Cruz", "Riza Aliyev",
                // index:             0                  1             2             3             4
                "Elvin Karimli", "Shanza Khan", "Mariam Bmahmadyar", "Layla Mansour", "Imane Helali"};
        // index:      5                 6              7                   8               9

        String reversed = "";
        for (String each : names) {
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);

        }


    }


}
