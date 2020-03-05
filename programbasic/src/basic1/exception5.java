package basic1;

public class exception5 {
	int getmark(int a,int b)throws Exception
	{
		try
		{
			return a/b;
		}catch(Exception e)
		{
			throw e;
		}finally {
		System.out.println(a+b);
		}
	}

	public static void main(String[] args) {
		int a=2;
		exception5 obj=new exception5();
		try
		{
			a=obj.getmark(5, 0);
			
		}catch(Exception e)
		{
			try
			{
			a=obj.getmark(5, a);
			}catch(Exception e1)
			{
				System.out.println("b");
			}
		}
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
