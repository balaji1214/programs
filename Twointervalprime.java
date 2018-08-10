

import java.util.*;
import java.lang.*;
import java.io.*;


class Twointervalprime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
    Scanner sc=new Scanner(System.in);
		int low, high;
		low=sc.nextInt();
		high=sc.nextInt();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
	    {
                System.out.print(low + " ");
	    }
            ++low;
        }
 
	}
}
