import java.io.*;
import java.util.*;
public class largest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if((a>b)&&(a>c))
{
Sytem.out.println(a);
}
else if((b>c)&&(b>a))
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}
