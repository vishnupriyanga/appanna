import java.io.*;
import java.util.Scanner;
public class calculate
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
if(n==0)
{
System.out.println("zero");
}
else if(n>=1)
{
System.out.println("positive");
}
else
{
System.out.println("negative");
}
}
}
