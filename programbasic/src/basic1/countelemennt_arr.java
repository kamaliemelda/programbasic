package basic1;

public class countelemennt_arr {

	public static void main(String[] args) {
		int[]arr1= {10,20,30,10,20,30,10,20,40,50};
		int[] freq=new int[arr1.length];
		for(int j=0;j<arr1.length;j++)
		{
			int no=arr1[j];
			int count=1;
			for(int i=j+1;i<arr1.length;i++)
			{
				if(no==arr1[i])
				{
					count++;
					freq[i]=-1;
				}
			}
			if(freq[j]!=-1)
			{
				freq[j]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				System.out.println(arr1[i]+"count:"+freq[i]);
			}
		}
		int max=Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max=freq[i];
				index=i;
			}
		}
		System.out.println(arr1[index]);
			}

		// TODO Auto-generated method stub

	}


