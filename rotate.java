import java.io.*;
import java.util.*;
public class rotate
{
public static void main(String args[])
{
int l=0,i;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int d=s.nextInt();
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int j=d;j<n;j++)
{
b[l]=a[j];
l++;
}
for(int k=0;k<d;k++)
{
b[l]=a[k];
l++;
}
for(i=0i<n;i++)
{
System.out.println(b[i]);
}
}
}
