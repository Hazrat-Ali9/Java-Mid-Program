import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>c && a>b)System.out.println(a);
		else if(b>a && b>c)System.out.println(b);
		else System.out.println(c);
	}
}

// Largest Program ------- 4