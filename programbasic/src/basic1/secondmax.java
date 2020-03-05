package basic1;

public class secondmax {

	public static void main(String[] args) {
		int[]no= {3,5,12,8,7};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int i=0;
		while(i<no.length)
		{
			if(no[i]>max)
			{
				max2=max;
				max=no[i];
				
			}
			else if(no[i]>max2)
			{
				max2=no[i];
			}
			i++;
		}
		System.out.println(max2);
		// TODO Auto-generated method stub

	}

}
