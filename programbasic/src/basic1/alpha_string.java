package basic1;

public class alpha_string {

	public static void main(String[] args) {
		String name="kamali";
		String s="";
		char c[]=name.toCharArray();
		int len=name.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			s=s+c[i];
		}
		                            
		System.out.println(s);
		
		
		// TODO Auto-generated method stub

	}

}
