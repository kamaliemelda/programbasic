package basic1;

public class merge_arr {

	public static void main(String[] args) {
		int[]a= {10,20,30};
		int[]b= {5,15};
		int[]result=new int[a.length+b.length];
		int i=0;
		while(i<a.length)
		{
			result[i]=a[i];
			i++;
		}
		
		int k=0;
		while(i<result.length)
		{
			result[i]=b[k];
			k++;
			i++;
		}
		for(int n=0;n<result.length;n++)
		{
			System.out.println(result[n]);
		}
		// TODO Auto-generated method stub

	}

}
