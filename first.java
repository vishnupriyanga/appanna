import java.io.*;
import java.util.*;
public class first
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0,j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
count++;
System.out.println("repeated");
}
}
if(count==0)
{
System.out.println("not repeated");
}
}
}
