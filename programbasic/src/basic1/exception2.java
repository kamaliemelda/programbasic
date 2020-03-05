package basic1;

public class exception2 {

	public static void main(String[] args) {
		int k[]= {5,6,7};
		int a=5,b=6;
		int c=0;
		try {
			c=a/b;
			System.out.println("A="+k[c]);
		}catch(ArithmeticException a1)
		{
			System.out.println("B="+c);
		}catch(ArrayIndexOutOfBoundsException s)
		{
			try
			{
				System.out.println(k[a]);
			}catch(Exception e)
			{
				System.out.println("k");
			}
			System.out.println("C="+k[a]);
		}
		System.out.println("hello");
		// TODO Auto-generated method stub

	}

	}
