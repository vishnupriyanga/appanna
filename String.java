import java.lang.*;
import java.util.*;
public class String
 {
void reverseword(String str)
{

        String[] arr=str.split(" ");

        StringBuilder builder=new StringBuilder("");
        for(int i=arr.length-1; i>=0;i--)
        {
            builder.append(arr[i]+" ");
        }
        System.out.println(builder.toString());
    }


public static void main(String[] args)throws Exception
 {
        Scanner sc=new Scanner(System.in);
        StringReversefunction s=new StringReversefunction();
        String str;
        str=sc.nextLine();
        s.reverseword(str);
}

}
