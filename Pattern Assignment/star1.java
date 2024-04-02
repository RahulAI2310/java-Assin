package java_basic2;

public class star1 {
	
	public static void main(String args[])
	{
		int space=0;
		int rows=5;
		int star=5;
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space++;
			star--;
		}
	}

}
