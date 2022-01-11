package day16_ForLoopStringPractice;

public class DigitsLettersSpecialCharsTask {

    public static void main(String[] args) {

     String str = "Cydeo12345School!@#$%) (WoodenSpoon"; // Use the ascii table

     String digits = ""; // 12345
     String letters = ""; // CydeoWoodenSpoon
     String specialChars = ""; // !@#$%

        for (int i = 0; i < str.length(); i++) { // i is representing all index numbers of str (0 ~ last index)

            char ch = str.charAt(i); // ch has every character in the str --> Cydeo12345School!@#$%WoodenSpoon


            //System.out.println(ch); // can be used to run and check if ch has every character in the str
            if(ch >='0' && ch <= '9'){ // If the character is between '0' to '9' then it's digit.
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){ // If the character is between 'A' to 'Z' then it's letter.
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z') { // If the character is between 'a' to 'z' then it's letter.
                letters += ch;
            }else{ // If the character neither digit not letter, then it's special character.
                if(ch != ' ') { // If the special character is neither digit not letter, then it's special character.
                    specialChars += ch;
                }
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChara = " + specialChars);










    }





}
