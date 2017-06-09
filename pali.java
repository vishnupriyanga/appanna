import java.io.*;
import java.util.*;
public class pali
{
public static void main(String args[])
{
int r=0;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while(a>0)
{
int x=a%10;
r=(x*10)+r;
a=a/10;
}
if(a==x)
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}
