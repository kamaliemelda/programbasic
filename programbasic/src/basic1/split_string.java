package basic1;

public class split_string {

	public static void main(String[] args) {
		String k="if you think you can do it,you can do it";
		String s[]=k.split(" ");
		int len=s.length;
		int count=0;
		int max=0,index=0;
		for(int i=0;i<len;i++)
		{
	       if((s[i]).equals("can"));
	    	   
			{
				count++;
				
			}
	       
		}
		System.out.println(count);
		
		
		
		
			
		
		
		
		         
		             
		// TODO Auto-generated method stub

	}

}
