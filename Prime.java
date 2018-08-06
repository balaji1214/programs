
import java.util.*;
import java.lang.*;
import java.io.*;


class Prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;++i)
		{
		if(n%i==0)
		{
		flag=1;
		break;
		}
		}
	
		if(flag==0)
		System.out.println("yes");
		else
System.out.println("no");
		
	}
	
}
