import java.io.*;
import java.util.*;
public class anagram
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
char c[]=str.toCharArray();
int n=str.length();
String s1=s.next();
int m=s1.length();
if(n==m)
{
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(c[i]==c[j])
{
count++
}
}
if(count!=0)
{
System.out.println("Anagram");
}
else
{
System.out.println("not an anagram");
}
}
}
