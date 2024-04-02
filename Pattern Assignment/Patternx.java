package java_basic2;

public class Patternx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




		int px=1,py=5,r,c;

		for(r=1;r<6;r++)
		{
			for(c=1;c<6;c++)
			{
				

				if( px==c || py==c  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		    px++;
		    py--;
}
	}
}