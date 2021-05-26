import java.io.*;
 import java.lang.*;
import java.util.*;
class bit
{public static void main (String[] args)throws java.lang.Exception
	{int t=0;int n=0;int s=0;int k=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	      t=sc.nextInt();
	       for (int i=0;i<t;i++)
	      {s=0;
	           if(sc.hasNextInt()) 
	           n=sc.nextInt();
	           for (int j=0;j<n;j++)
	           {   if(sc.hasNextInt()) 
	                k=sc.nextInt();
	               if (k%2==0)
	               {
	                   s=s+k;
	               }
	           }System.out.println(s);
	       }
	   }
}