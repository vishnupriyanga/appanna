import java.io.*;
import java.util.*;
public class evens
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt()
int m=s.nextInt()
for(int i=n;i<m;i++)
{
if(i%2!==0)
{
count=1;
break;
}
else
{
count=0;
break;
}
}
if(count==0)
{
System.out.println(i);
}
}
}
