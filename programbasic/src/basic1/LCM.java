package basic1;

public class LCM {

	public static void main(String[] args) {
		int no1=2,no2=3;
		
		int big=no1>no2?no1:no2;
		int big2=big;
		int small=no1<no2?no1:no2;
		while(true)
		{
			if (big%small==0)
			{
				System.out.println(big);
				break;
				
			}
			big+=big2;
		}
		// TODO Auto-generated method stub

	}

}
