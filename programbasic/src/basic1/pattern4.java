package basic1;

public class pattern4 {

	public static void main(String[] args) {
		for(int r=1;r<=3;r++)
		{
			for(int c=1;c<=3;c++)
			{
				if((r==2)&&((c==1)||(c==3)))
				{
					System.out.print(" " );
				}
				else if((r==3) && ((c==1) || (c==3)))
					{
						System.out.print(" ");
					}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			
			
			
			
				}
		// TODO Auto-generated method stub

	}

}
