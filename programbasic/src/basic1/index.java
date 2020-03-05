package basic1;

public class index {

	public static void main(String[] args) {
		int[]array= {5,3,2,4,7};
		int no=40;
		int i=0;
		while(i<array.length)
		{
			if(array[i]==40)
			{
				break;
			}
			i++;
		}
		if(i==array.length)
		{
			System.out.println("no is not present");
		}else
		{
		System.out.println(no+" is present at"+i);
		}
		
		// TODO Auto-generated method stub

	}

}
