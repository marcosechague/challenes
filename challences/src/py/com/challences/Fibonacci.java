package py.com.challences;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String... args){
		System.out.println("Fibonacci ");
		System.out.println("How many test do you want to do: ");
		Scanner sc = new Scanner(System.in);
		int testQuantity = sc.nextInt();
		 String[] series = new String[testQuantity];
		
		for(int i=0; i<testQuantity ; i++) {
			int number;
	        do{
	            System.out.println("Please enter a number greaten than 1 : ");
	            number = sc.nextInt();
	        }while(number<=1);

	        int first = 0;
	        int next = 1;
	        int result =0;
	        
	        String serie = first+","+next;
	        
	        while(result<number){
	        	result = first+next;
	        	first = next;
	        	next = result;
	        	if(result<=number) serie+=","+result;
	        }  
	        System.out.println(serie);
	        series[i] = serie;        
		}
		
		System.out.println("All the fibonacci series: "+Arrays.asList(series).toString());
		        
	}

}
