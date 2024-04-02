package java_basic2;
import java.util.Scanner;
public class arr1 {

	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		int i,x=0;
		int a[];
		int b[];
		a = new int[5];
		b = new int[4];
		
		System.out.println("Enter array elements");
		
		for(i=1;i<=4;i++)
		{
			a[i]=cc.nextInt();
			
			if(a[i]>0)
			{
				b[i]=a[i];
				x=i;
			}
		}
		
		
		

		for(i=1;i<=a[i];i++)
		{
			
			System.out.println("b["+i+"]="+b[i]);
		}
		
		System.out.println("Total element copied " + x );

	}

}
