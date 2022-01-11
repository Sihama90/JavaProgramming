package day20_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class AlphabetTask {

    public static void main(String[] args) {

        // char[]letters2 = new char[26]; // [Z ~ A] (i--)
        char[]alphabet = new char[26]; // Z ~ A
        alphabet [0] = 'Z'; // 90
        alphabet [1] = 'Y'; // 89
        alphabet [2] = 'X'; // 88

        // short ways to print entire array.

        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--) {
            alphabet[i] = j;
        }

        //char ch = 'Z';
        //for (int i = 0; i < alphabet.length; i++, ch--) {
            //alphabet [i] = ch;
        }
        //System.out.println(alphabet[0]); // to print the element of an array.
        //System.out.println(Arrays.toString(alphabet)); // to print the entire array must have to.String method.
        //System.out.println(alphabet);








    }




