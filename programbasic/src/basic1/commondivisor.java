package basic1;

public class commondivisor {

	public static void main(String[] args) {
		int no1=15,no2=16;
		int small=no1<no2?no1:no2;
		boolean common=false;
		while(small>=2)
		{
			if((no1%small==0) && (no2%small==0))
			{
				common=true;
				System.out.println("GCD"+small);
				break;
				
			}
			small--;
		}
		if(common==false)
		{
			System.out.println("invalid");
		}
		
		// TODO Auto-generated method stub

	}

}
