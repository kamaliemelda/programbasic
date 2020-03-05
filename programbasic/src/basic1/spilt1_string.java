package basic1;

public class spilt1_string {

	public static void main(String[] args) {
		String k="if you think you can do it,you can do it";
		String s[]=k.split(" ");
		int len=s.length;
		String sum=" ";
		for(int i=0;i<len;i++)
		{
			if((s[i]).equals("do"))
			{
				s[i]="write";
			}
		}
		for(int i=0;i<len;i++)
		{
			sum=sum + " "+s[i];
		}
		System.out.println(sum);
		
		
		// TODO Auto-generated method stub

	}

}
