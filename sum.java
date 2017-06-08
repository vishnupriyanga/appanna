import java.io.*;
import java.util.*;
public class hello
{
public static void main(String args[])
{
int sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
Syste.out.println(sum);
}
}
