import java.io.*;
import java.util.*;
public class digits
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
int a=s.nextInt()
while(a>0)
{
int x=a%10;
int y=a/10;
count++;
}
System.out.println(count);
}
}
