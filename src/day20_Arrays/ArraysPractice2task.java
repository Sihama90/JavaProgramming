package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2task {

    public static void main(String[] args) {

      //
      char[] letters = new char[26];
      //Long way to do it
      letters[0] = 'A';
      letters[1] = 'B';
      letters[2] = 'c';
      letters[3] = 'B';
      letters[4] = 'B';
      letters[5] = 'B';
      letters[6] = 'B';
      letters[7] = 'B';
      letters[8] = 'B';
      letters[9] = 'B';
      letters[10] = 'B';
      letters[11] = 'B';
      letters[12] = 'B';
      letters[13] = 'B';
      letters[14] = 'B';
      letters[15] = 'B';
      letters[16] = 'B';
      letters[17] = 'B';
      letters[18] = 'B';
      letters[19] = 'B';
      letters[20] = 'B';
      letters[21] = 'B';
      letters[22] = 'B';
      letters[23] = 'B';
      letters[24] = 'B';
      letters[25] = 'B';

//
      //Easy way to do it
        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters)); // It will print letters: (A ~ Z)

        System.out.println("---------------------------------------------------------------------------");

        // Another easy way
        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {
            letters[i] = (char)j;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("---------------------------------------------------------------------------");

        //Another way
        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));






    }





}
