package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
String input = "I am a software tester";
        
    // Split the input string into words
String[] words = input.split(" ");
        
  // Iterate & reversing the ones at odd positions
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                words[i] = reverseWord(words[i]);
            }
        }
        
   // Reconstruct the string with the reversed and unchanged words
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
   // Remove the trailing space
       String reversedString = result.toString().trim();
        
       System.out.println(reversedString);
    }
    
    // Function to reverse a word
    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
	}
}
