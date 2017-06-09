import java.io.*;
import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=1;i<a;i++)
{
if(i%a!=0)
{
System.out.println("prime number");
}
else
{
System.out.println("not primenumber");
}
}
}
}
