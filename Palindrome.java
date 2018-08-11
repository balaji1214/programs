/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int number, originalNumber, remainder, result = 0;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(" yes");
        else
            System.out.println(" no");
	}
}
