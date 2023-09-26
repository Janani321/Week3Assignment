package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String text1 = "stops";
    String text2 = "potss";

    boolean areAnagrams = areAnagrams(text1, text2);
    if (areAnagrams) {
    System.out.println("The strings are anagrams.");} 
    else {
    System.out.println("The strings are not anagrams.");
        }
    }
	public static boolean areAnagrams(String text1, String text2) {
  
   // Remove spaces and convert strings to lowercase 
    text1 = text1.replaceAll("\\s", "").toLowerCase();
    text2 = text2.replaceAll("\\s", "").toLowerCase();

  // Check if the lengths of the strings are the same
    if (text1.length() != text2.length()) {
    return false;
        }

  // Convert the strings to character arrays and sort them
    char[] charArray1 = text1.toCharArray();
    char[] charArray2 = text2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

  // Compare the sorted character arrays
    return Arrays.equals(charArray1, charArray2);
    }
	}

