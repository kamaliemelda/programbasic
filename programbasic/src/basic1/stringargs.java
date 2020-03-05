package basic1;

import java.util.Scanner;

public class stringargs {

	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] marks=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.println("please enter mark");
			marks[i]=sc.nextInt();
			total=total+marks[i];
			
		}
		System.out.println(total);
		sc.close();
		
		

}
}