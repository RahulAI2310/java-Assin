package java_basic2;

import java.util.Scanner;
public class scan{

	public static void main(String[] args) {
		int a;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		a=obj.nextInt();
		
		if(a<0)
		{
			System.out.println("Number Negative");
		}
		else
		{
			
				System.out.println("Number Positive");
			
		}
	}

}