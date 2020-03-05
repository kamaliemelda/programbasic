package basic1;

public class palindrom_string {

	public static void main(String[] args) {
		String s="amma";
		String s1="";
	
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		
		}
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("the string is palindrom");
		}
		else
		{
			System.out.println("the string is not palindrom");
		}
		// TODO Auto-generated method stub

	}
	

}
