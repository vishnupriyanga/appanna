import java.io.*;
import java.util.*;
public class primes
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
for(int i=n;i<m;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count=1;
break;
}
else
{
count=0;
}
}
if(count==0)
{
System.out.println(i);
}
}
}
