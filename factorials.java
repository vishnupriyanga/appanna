import java.io.*;
import java.util.*;
public class factorials
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,fact=1;
for(i=0;i<n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
