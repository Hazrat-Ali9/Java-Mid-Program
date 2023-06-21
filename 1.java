import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo
{
	public static void main (String[] args) //throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y%100==0){
			if(y%400==0)System.out.println("YES");
			else System.out.println("NO");}
	else{
		if(y%4==0)System.out.println("YES");
		else System.out.println("NO");}
		
	}
}


// Leap Year ------> 1