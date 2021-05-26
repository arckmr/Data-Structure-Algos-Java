import java.io.*;
import java.util.*;
public class file
{
    public static void main (String args[])throws IOException
    {
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    int c=0;
    int n=Integer.parseInt(br.readLine());
    String s=br.readLine();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='x')
        {
            c++;
        }
    }if(c>2)
    System.out.println(c-2);
    else
    System.out.println(0);
    }
 
    
}
 
