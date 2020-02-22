package basic1;

public class prime {

	public static void main(String[] args) {
	int	primecount=1;
	int no = 3, div = 3;

	
		while(primecount<20)
		{
		
			boolean check = true;
			while (div<no) {                                    
				if (no % div == 0) {
					//System.out.println("not prime");
					check = false;
					break;
				}
				div = div + 2;

			}
			if (check == true) {
				System.out.println(no +"prime");
				primecount++;
			}  
	}
	
		no=no+2;
	}
}
