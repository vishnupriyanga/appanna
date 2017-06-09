import java.io.*;
import java.util.*;
public class amstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int c=0;
int n=s.nextInt();
int a=(int) Math.log10(n)+1;
while(n>0)
{
int x=n%10;
n=n/10;
c+=Math.pow(x,a);
}
if(c==n)
{
System.out.println("amstrong number");
}
else
{
System.out.println("not an amstrongnumber");
}
}
}
