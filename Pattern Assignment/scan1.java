
package java_basic2;

import java.util.Scanner;
public class scan1{

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		d=obj.nextInt();
		
		
		if(a>b && a>c && a>d)
		{
			System.out.println("Number " + a + " is largest");
		}
		if(b>a && b>c && b>d)
		{
			System.out.println("Number " + b + " is largest");
		}
		if(c>a && c>b && c>d)
		{
			System.out.println("Number " + c + " is largest");
		}
		else
		{
			System.out.println("Number " + d + " is largest");	
		}
	}

}