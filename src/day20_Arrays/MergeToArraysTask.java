package day20_Arrays;

import java.util.Arrays;

public class MergeToArraysTask {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aysun", "Duygu", "Suat", "Valriy"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) { // will print Ali, Layan, Aysenur
            students[i++] = each;
        }
        for(String each : group2){

        }
        System.out.println(Arrays.toString(students));


        System.out.println("-------------------------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;
        for(char ch : ch1){
            j++;
        }
        for(char ch : ch2){
            chars[j] = ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));



    }







}
