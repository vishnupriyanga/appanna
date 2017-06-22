import java.io.*;
import java.util.*;
class swap{
	public static void main (String[] args) {
	    int i,j;
	    char temp;
	    Scanner s=new Scanner(System.in);
	    String a=s.nextLine();
	    char c[]=a.toCharArray();
	    for(i=0,j=i+1;i<c.length&&j<c.length;i=i+2,j=j+2)
	    {
	        
	            temp=c[i];
	            c[i]=c[j];
	            c[j]=temp;
	    }
System.out.println(c);

	}
}
