package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {

    // reverse the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = {};
        for (int i = array.length -1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

}
