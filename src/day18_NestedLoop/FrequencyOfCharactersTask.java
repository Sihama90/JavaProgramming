package day18_NestedLoop;

public class FrequencyOfCharactersTask {

    public static void main(String[] args) {
        String str = "aabcccd";
        String result = ""; //a2b1c3d1

        char ch = str.charAt(0); // 'a'
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j); // each character of the str
            int cont = 0;

            for (int i = 0; i < str.length(); i++) {
                char each1 = str.charAt(i); // each character of the str
                if(ch == each1){
                        count++;
                }
            }

            if(result.contains("" + ch)){
                continue;
            }
            result += ch;
            result += count;
        }

        System.out.println(count);
/*
  Task:
  4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters


 */





    }




}
