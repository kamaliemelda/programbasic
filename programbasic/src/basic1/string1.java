package basic1;

public class string1 {

	public static void main(String[] args) {
		String s="program";
		char c[]=s.toCharArray();

System.out.println(c[0]);	
int index=s.indexOf('a');
System.out.println(index);
char c1=s.charAt(3);
System.out.println(c1);
String sub=s.substring(1, 4);
System.out.println(sub);
String s1="program";
s.equals(s1);// TODO Auto-generated method stub

	}

}
