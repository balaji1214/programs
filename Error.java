/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Error
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n,k1;
		int k=0;
		n=sc.nextInt();
	//	k=sc.nextInt();
		//for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
		k=k+j;
		System.out.println(k);
		//System.out.println(i);
	}
}
