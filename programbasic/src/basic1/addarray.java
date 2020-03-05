package basic1;

public class addarray {

	public static void main(String[] args) {
		int[]arr1= {5,8,3,10};
		int[]arr2= {2,3};
		int len1=arr1.length;
		int len2=arr2.length;
		int len=len1>len2?len1:len2;
		int[]result=new int[len];
		int addcount=len1<len2?len1:len2;
		int i=0;
		while(i<addcount)
		{
			result[i]=arr1[i]+arr2[i];
			i++;
		}
		//System.out.println(i);

		while(i<len)
		// TODO Auto-generated method stub
		{
			result[i]=arr1[i];
			i++;
			
		}
		for(int k=0;k<result.length;k++)
		{
			System.out.println(result[k]);
		}

	}

}
