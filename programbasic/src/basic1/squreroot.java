package basic1;

public class squreroot {

	public static void main(String[] args) {
		int n=81;
		int div=2;
		while(div<=n/2)
		{
			if(n/div==div)
			{
				System.out.println(div+"root");
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
