package basic1;

public class exception4 {
	void work() throws Exception {

		try
		{
			System.out.println(5/0);
		}catch(Exception e)
		{
		throw e;
		}finally {
			System.out.println("end of method");
		} 
		
		}
			
		

	public static void main(String[] args) {
		exception4 e=new exception4 ();
	
			try {
				e.work();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("error");
			}
			
			
				
			
		 
			
			
			// TODO Auto-generated catch block
		
		}
		
		// TODO Auto-generated method stub

	}


