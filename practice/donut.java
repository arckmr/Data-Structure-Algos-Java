import java.io.*;
import java.util.Scanner;
public class donut
{
    public static void main (String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        long x=b*a;
        if(a<c)
        {System.out.print(1);}
        else 
        System.out.print(-1); 
        if(x>c)
        {System.out.print(b);}
        else
        System.out.print(-1);
         System.out.println();
        }
}
       
    }
    

