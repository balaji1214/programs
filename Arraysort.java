/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Copied
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[100000];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		  arr[i]=sc.nextInt();
	
		}
		        for (int i = 0; i < n; i++) 

        {

            for (int j = i + 1; j < n; j++) 

            {

                if (a[i] > a[j]) 

                {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }

       

        for (int i = 0; i < n - 1; i++) 

        {

            System.out.print(a[i] + " ");

        }

        System.out.print(a[n - 1]);
		
		
	}
}
