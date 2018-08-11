/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hoursmins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int m,h;
		m=sc.nextInt();
		//for(m=60;m=r;m++)
		//int r=m%60;
		if(m>=60)
		{
			int r1=m/60;
			
		System.out.println(+ r1 +" "+"0");
		}
		else if(m<60)
		{
			System.out.println("0" +" " +m );
		}
	}
}
