import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>0 && b>0 && c>0 && a+b+c==180)System.out.println("YES");
		else System.out.println("NO");
	}
}

// Reverse String -----> 6 