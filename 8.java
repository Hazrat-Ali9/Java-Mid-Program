import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(1); Not prime
		for(int i=2; i<=n; i++){
			int prime=1;
			for(int j=2; j<=i/2; j++){
				if(i%j==0){
					prime=0;
					break;
					}}
					if(prime==1)System.out.println(i);
			}
	}
}

// Prime Number ------> 9 