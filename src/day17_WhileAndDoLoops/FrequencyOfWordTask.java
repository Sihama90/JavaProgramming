package day17_WhileAndDoLoops;

public class FrequencyOfWordTask {

    public static void main(String[] args) {

        String str = "JavaJavaJava";

        int frequency = 0;

        for (int i = 0; i < str.length()-4; i++) {
            String eachSub = str.substring(i, i + 4);
            //System.out.println(eachSub);

            if (eachSub.equals("Java")) {
                frequency++;
            }


        }

        System.out.println(frequency);
/*
  Warmup Task:
   2. Write a program that can return the frequency of the word Java from the sentence
   Ex:
   sentence = "JavaJavaJava";
   Output:
          3
     Notes:
     Str = "JavaJava"
     substrings:
     1. Java // substring (0,4)
     2. avaJ // substring (1, 5)
     3. vaJa // substring (2, 2+4)
     4. aJav // substring (3, 3+4)
     5. Java // substring (4, 4+4)

 */






    }






}
