package basic1;

public class count_element {

	public static void main(String[] args) {
		int[]array= {10,20,10,30,40,10,25};
		int search=10,count=0;
		int i=0;
		while(i<array.length)
			{
			if(array[i]==search)
			{
			count++;
		}
		i++;
	}
System.out.println(count);		
}

	}


