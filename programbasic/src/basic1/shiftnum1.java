package basic1;

public class shiftnum1 {

	public static void main(String[] args) {
		int i=0;
		int[]a= {15,20,25,20,25};
		int temp1=a[0],temp2=a[1];
		
		while(i<3)
		{
			a[i]=a[i+2];
			i++;
			
		}
		a[3]=temp1;
		a[4]=temp2;
		
		// TODO Auto-generated method stub

	}

}
