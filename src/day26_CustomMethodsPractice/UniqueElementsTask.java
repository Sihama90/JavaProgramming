package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class UniqueElementsTask {

    public static int[] uniqueElements(int[] array){
        int[] result = {};
        for(int each : array){
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }



}
