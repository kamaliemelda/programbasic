package basic1;

public class findmark {

	public static void main(String[] args) {
		int[]marks= {92,82,83,93,97};
		boolean nopresent=false;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]==54)
			{
				nopresent=true;
				System.out.println("i got it");
				break;
				
			}
		}
			if(nopresent==false)
			{
				System.out.println("mark not present");
				
			}
		}
		// TODO Auto-generated method stub

	}


