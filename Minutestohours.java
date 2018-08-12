/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Minutestohours
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int m,h;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		if(m<60)
		{
			System.out.println("0" +" " +m);
		}
		else if(m>=60)
		{
			
			int a2=m%60;			
			int a1=m/60;
			
			System.out.println(a1 +" "+ a2);
		}
		
		
	}
}
