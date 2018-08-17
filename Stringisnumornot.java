/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stringisnumeric
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		boolean numeric = true;

        try {
            Double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("Yes");
  
	else	
		System.out.println("No");
 			
		
		
		
	}
}
