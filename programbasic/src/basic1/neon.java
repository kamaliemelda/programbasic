package basic1;

public class neon {

	public static void main(String[] args) {
		int no=9;
		int sum=0;
	int	squre=no*no;
		while(squre>0)
		{
			int rem=squre%10;
			sum=sum+rem;
			squre=squre/10;
			
		}
		if(sum==no)
		{
			System.out.println("NEON");
		}
		else
		{
			System.out.println("NOT NEON");
		}
		// TODO Auto-generated method stub

	}

}
