package basic1;

public class reversenum {

	public static void main(String[] args) {
		int no=1212;
		int r=no;
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		
			System.out.println(rev);
			if(r==rev)
			{
				
			System.out.println("palindrom");
			}
			else
			{
				System.out.println("not palindrom");
			}
		
	
		// TODO Auto-generated method stub

	}

}
