package java_basic2;

import java.util.Scanner;

class star
{
public static void main(String args[])
{
Scanner ss = new Scanner(System.in);

int row=5,space=4;
int star=1,i,j,x;

for(i=1;i<=row;i++)
{
	for(int k=1 ;k<=space;k++)
	{
		System.out.print(" ");
	}

for (j=1;j<=star;j++)
{
	System.out.print("* ");
}
System.out.println();
space--;
star++;
}



}
}