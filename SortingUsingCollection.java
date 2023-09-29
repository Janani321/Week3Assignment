package week3.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list to hold the String elements
        List<String> stringList = new ArrayList<String>();

        // Add the elements to the list
        stringList.add("HCL");
        stringList.add("Wipro");
        stringList.add("Aspire Systems");
        stringList.add("CTS");
	
     // Reverse the list
        Collections.reverse(stringList);

        // Convert the reversed list to a String array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (String str : stringArray) {
            System.out.println(str);
            }
	}
}
