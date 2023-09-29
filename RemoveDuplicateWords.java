package week3.day2;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateWords {
    private static int count;

	public static void main(String[] args) {
        String input = "We learn Java basics as part of java sessions in java week1";
        
        //Split the string by space 
        String[] eachWord = input.split(" ");
       
        count = 0;
        //Declare nested loop to compare the string
        for (int i =0; i <eachWord.length; i++) {
        	for (int j = i+1; j <eachWord.length; j++) {
        	if(eachWord[i].equals(eachWord[j])) {
        		count++;
        //Replace the string by null		
        		eachWord[j]="";
        	}
        	}
        }
        //Declare the loop to print the string
        for (int i = 0; i < eachWord.length; i++) {
        	if(!eachWord[i].equals("")) {
        }
        	//Print Statement
        System.out.print(eachWord[i]);
    }
}
}
