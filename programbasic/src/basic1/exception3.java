package basic1;

public class exception3 {

	public static void main(String[] args) {
		int x[]= {};
		int a=5,b=6;
		try {
			System.out.println(x[a/b]);
		}catch(ArithmeticException e)
		{
			System.out.println(a);
		}catch(Exception e)
		{
			System.out.println(b);
		}
		// TODO Auto-generated method stub

	}

}
