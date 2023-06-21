import java.util.*;
class Demo
{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int start;
		for(int i=1; i<=row; i++){
			start=row-i;
			for(int spc=0; spc<start; spc++){
				System.out.print(' ');
				}
			for(int j=0; j<i; j++){
				System.out.print("* ");
				}
				System.out.print('\n');
			}
	}
}

// Pyramid Pattern -----10