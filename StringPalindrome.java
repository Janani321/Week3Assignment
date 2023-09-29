package week3.day2;

public class StringPalindrome {

	public static void main(String[] args) {
// TODO Auto-generated method stub
  String input = "Madam";
// Convert the string to lowercase (case-insensitive)
  String lowercaseWord = input.toLowerCase();
 // Remove non-alphanumeric characters
  String cleanInput = lowercaseWord.replaceAll("[^a-z0-9]", "");
  // Reverse the string
  String reversedWord = reverseString(cleanInput);
// Check if it's a palindrome
	if (cleanInput.equals(reversedWord)) {
	System.out.println("The string \"" + input + "\" is a palindrome.");
	} else {
	System.out.println("The string \"" + input + "\" is not a palindrome.");
	        }
	    }
	// Function to reverse a string
    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}

