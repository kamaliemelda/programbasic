package basic1;

public class negative_arr {

	public static void main(String[] args) {
		int[]arr1= {-5,8,-3,2};
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
			{
				count++;
			}
		}
		int[] result=new int[count];
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<0)
			{
				result[j]=arr1[i];
				j++;
			}
		}
		for(int n=0;n<result.length;n++)
		{
			System.out.println(result[n]);
		}
		// TODO Auto-generated method stub

	}

}
