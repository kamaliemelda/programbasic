package basic1;

public class maxnum_arr {

	public static void main(String[] args) {
		int[]no= {3,4,7,8,6};
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<no.length)
		{
			if(min>no[i])
			{
				min=no[i];
			}
			i++;
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}
