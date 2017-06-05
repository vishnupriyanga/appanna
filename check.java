import java.io.*;
import java.util.Scanner;
public class check
{
public static void main(String args[])
{
char a;
Scanner s=new Scanner(System.in);
a=s.next()charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}
