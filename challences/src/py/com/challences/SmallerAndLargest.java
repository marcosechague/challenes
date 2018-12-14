package py.com.challences;

import java.util.Scanner;

public class SmallerAndLargest {
	
	public static void main(String... args) {
		System.out.println("Smaller an Largest number from a given list");
		System.out.print("Please enter the quantity of elment to process: ");	
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		System.out.println("");	
		
		int[] elements = new int[arrayLength];
		for (int i = 0; i<arrayLength; i++) {
			System.out.print("Please enter a number: ");	
			int readed = sc.nextInt();
			elements[i] = readed;
			System.out.println("");	
		}
		
		int max = elements[0];
		int min = elements[0];
		
		for(int i =1 ; i<arrayLength ; i++) {
			if(elements[i]>max) {
				max = elements[i];
			}
			
			if(elements[i]<min) {
				min = elements[i];
			}
		}
		
		System.out.println("The max is: "+max);
		System.out.println("The min is: "+min);
	}
	
}
