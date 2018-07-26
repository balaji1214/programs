/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int cost1=20;
		int cost2=30;
		int cost3=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int sc1=sc.nextInt();
		//int sc2=sc.nextInt();
		if(sc1==1)
		{
			System.out.println("for 10km cost is" +cost1 + "rupees");
		}	
		else if(sc1==2)
		{
		System.out.println("for 20km cost is" +cost2  + "rupees");
		}	
		else if(sc1==3)
		{
			System.out.println("for 30km cost is" +cost3 + "rupees");
		}
		
		
	}
}
