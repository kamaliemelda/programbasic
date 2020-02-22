package basic1;

public class decitobinary {

	public static void main(String[] args) {
		int no=4;
		String rem="";
		while(no>0)
		{
			rem=no%2+rem;
			no=no/2;
			
		}
	
		System.out.print(rem);
		// TODO Auto-generated method stub

	}

}
