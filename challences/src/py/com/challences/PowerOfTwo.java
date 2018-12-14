package py.com.challences;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String... args) {
		System.out.println("Power of two checker");
		System.out.println("Please enter a numer : ");		
		Scanner sc = new Scanner(System.in);
		try{
			int i = sc.nextInt();
			if(i%2==0) {
				System.out.println(i+" is power of two!");
			}else {
				System.out.println(i+" is NOT power of two!");
			}
		}catch(InputMismatchException e) {
			System.out.println("Sorry, you must enter a number");
		}
	}
	
}
