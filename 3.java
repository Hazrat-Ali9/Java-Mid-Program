import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		char c;
		String rev="";
		for(int i=s.length()-1; i>-1; i--){
			c=s.charAt(i);
			rev+=c;
			}
			System.out.println(rev);
			
			if(s.equalsIgnoreCase(rev)){
				System.out.println("YES");}
				else {System.out.println("NO");}
	}
}