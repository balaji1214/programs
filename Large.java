import java.util.*;
import java.util.Scanner;
public class Large
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
if(x>y)
{
System.out.println(x);
}
else if(y>z)
{
System.out.println(y);
}
else
System.out.println(z);
}
}
