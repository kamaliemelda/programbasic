package basic1;

public class sumofdigit {

	public static void main(String[] args) {
		int no=12345,sum;
		do {
			 sum=0;
			while(no>0)
			{
				int rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			no=sum;
		}while(sum>9);
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
