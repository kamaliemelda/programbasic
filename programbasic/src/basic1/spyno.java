package basic1;

public class spyno {

	public static void main(String[] args) {
		int no=1124;
		int sum=0,prod=1;
		do {
			int rem=no%10;
			sum=sum+rem;
			prod=prod*rem;
			no=no/10;
			
		}while(no>0);
		System.out.println(prod);
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
