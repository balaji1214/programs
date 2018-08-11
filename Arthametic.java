/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arthametic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,a,d,sum=0;
		n=sc.nextInt();
		a=sc.nextInt();
		d=sc.nextInt();
		for(int i=a;n!=0;i=i+d)
		{
			sum=sum+i;
			n=n-1;
		// tot=a+(n-1)*d;
		
	
		}
		System.out.println(sum);
		}
	
}
