package java_basic2;
import java.util.Scanner;
public class new1 {

	public static void main(String[] args) {
	Scanner ss=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 3 number");
	a=ss.nextInt();
	b=ss.nextInt();
	c=ss.nextInt();
	if(a>b && a>c)
	{
		System.out.println("a= "+a +" is largest");
	}
	else if (b>a && b>c)
	{
		System.out.println("b ="+ b +" is largest");
	}
	else
	{
		System.out.println("c = "+ c +" is largest");
	}

	}

}
