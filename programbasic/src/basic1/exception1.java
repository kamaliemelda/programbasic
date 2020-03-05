package basic1;

public class exception1 {

	public static void main(String[] args) {
		int n=5;
		int a[]= {5,6,7};
		try
		{
			System.out.println(n/0);
			System.out.println(a[n]);
		}catch(ArithmeticException e)
		{
			System.out.println("hello");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		// TODO Auto-generated method stub

	}

}
