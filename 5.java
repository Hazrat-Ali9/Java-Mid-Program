import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		int prev=0, cur=1,res=1;
		for(int i=0; i<a; i++){
			System.out.println(prev);
			prev=cur;
			cur=res;
			res=prev+cur;
			}
		}
}

//Fibonacchi Series ------> 5  