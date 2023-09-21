package week2.day3;

public class LearnString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Sivakumar"; // STRING LITERAL
		int number = 30;

		// Return character of particular index
		System.out.println(name.charAt(1));

		// return string length
		System.out.println(name.length());

		// check the equality of string with in the given object
		System.out.println(name.equals("siva"));

		// check the equality of string with in the given object without case
		// sensitivity
		System.out.println(name.equalsIgnoreCase("SIVAKUMAR"));

		// Check string Empty or not
		System.out.println(name.isEmpty());

		// return true or false based on the given value is present or not
		
		  System.out.println(name.contains("S"));
		  System.out.println("*********************************************");
		 
		// Take a particular portion of the String
		System.out.println(name.substring(1));

		// Take a particular portion of the String begin and end index
		System.out.println(name.substring(1, 4));

		// Appends the string to the given string
		System.out.println(name.concat("arul"));

		// Replace the Existing character
		System.out.println(name.replace("a", "S"));

		// Replace the Existing charSequence
		System.out.println(name.replace("Siva", "Praksh"));

		// Find the position character in String
		System.out.println(name.indexOf("a"));

		// Find the position character specified from the index position
		System.out.println(name.indexOf("a", 4));
		System.out.println("+++++++++++++++++++++++++++++++++++");
		// Remove the Empty space string
		System.out.println(name.trim());

		// Convert to given data type as String
		System.out.println(String.valueOf(number));

		String uppercase = "SIVA";
		System.out.println(uppercase.toLowerCase());

		String lowercase = "siva";
		System.out.println(lowercase.toUpperCase());

		// Join the String easy way
		System.out.println(String.join("-", "Liberty", "Academy"));
		System.out.println(String.join("/", "02", "04", "1991"));
		// Split
		String splitThis = "Am,i,teaching,good?";
		String[] splitedwords = splitThis.split(",");
		for (String string : splitedwords) {
			System.out.println(string);

		}

	}


}
