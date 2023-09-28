package week3.day2;

public class SecondLargest {

	public static void main(String[] args) {
//Declare an array
		int temp, size;
	      int array[] = {3, 2, 11, 4, 6, 7};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
//Compare the first two elements of the array

	   if(array[i]>array[j]){
	   temp = array[i];
	   array[i] = array[j];
	   array[j] = temp;
	            }
	         }
	      }
	      //Print the output
System.out.println("The second largest number is "+array[size-2]);
			}
	
}

