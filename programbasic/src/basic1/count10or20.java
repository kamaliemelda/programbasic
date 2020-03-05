package basic1;

public class count10or20 {

	public static void main(String[] args) {
		int[]arr= {10,20,10,30,40,10,25,20};
		int[]search= {10,20};
		int j=0;
		while(j<search.length)
		{
			int i=0,count=0;
			while(i<arr.length)
			{
				if(arr[i]==search[j])
				{
					count++;
					
				}
				i++;
			}
			System.out.println(count);
			j++;
		}
		// TODO Auto-generated method stub

	}

}
