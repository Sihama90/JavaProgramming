package day14_String;

public class Day14ClassNotes {

    public static void main(String[] args) {

/*
  Task:
  Java Day14
Topic: String

package name: day14_String

String class: presented in "java.lang" package
			any class in "java.lang" package will be imported implicitly

			1. Object. 2 ways we can create objects:
								1. String literal:	String str1 = "Cydeo";
													String s =  "Cydeo";    str1 == s ==> true
											all the string literals will be stored in string pool

								2. by new keyword:  String str2 = new String("Cydeo");   str2 == str1 ==> false
													String str3 = new String("Cydeo");   str2 == str3 ==> false

													new different object will be created in the heap



			2. Sequences of characters
						each character in string has reprsentive number called index number (starts from 0)

						"Cydeo"
						 01234


			3. Immutable, once the object is created it can not be modified

					String str = "cydeo";
					str = str.toUpperCase(); //"CYDEO"



String Methods:
	charAt(index): returns the character at the given index, returns char
					String s = "Python"
					s.charAt(3) ==> 'h'


	length(): returns the total number of characters, returns int

			last index: length() -1


	toLowerCase(): returns new String in the lower case version of old string object

	toUpperCase(): returns new String in the upper case version of old string object

	trim(): returns new String without the white spaces (unused spaces)

	indexOf(str): returns the index number of first occurred character. returns int

	lastIndexOf(str): returns the index number of last occurred character. returns int

	replace(oldValue, newValue): returns new string by replacing the old values with the given new value.


	equals(): checks if two strings have same text, returns boolean



 */






    }






}
