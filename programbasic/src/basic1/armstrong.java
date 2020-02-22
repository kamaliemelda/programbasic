package basic1;

public class armstrong {

	public static void main(String[] args) {
		int no=153,no1=no;
		int arm=0,rem=0;
		while(no>0)
		{
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		if(no1==arm)
		{
			System.out.println("ARMSTRONG NUMBER");
		}
		else
		{
			System.out.println("NORMAL NUMBER");
		}
		
		// TODO Auto-generated method stub

	}

}
