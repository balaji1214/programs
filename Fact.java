/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,fact,f=1;
		Scanner sc=new Scanner(System.in);
		 fact=sc.nextInt();
		for(i=1;i<=fact;i++)
		f=f*i;
		System.out.println(f);
	}
}
