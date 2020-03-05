package basic1;

import java.util.Scanner;

public class arrayprogram {

	public static void main(String[] args) {
		int[]marks1=new int[5];
		int l=marks1.length;
		Scanner scannerobj=new Scanner(System.in);
		
		
		for(int i=0;i<l;i++)
		{
			System.out.println("enter marks");
			marks1[i]=scannerobj.nextInt();
			
		}
		// TODO Auto-generated method stub

	}

}
