/* package codechef; // don't place package name! */

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/* Name of the class has to be "Main" only if the class is public. */
class Cricket
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(sc.hasNext())
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int l=sc.nextInt();
		    
		    if(n>k*l || (n>1 && k==1))
		       System.out.println("-1");
		    else 
		    {
		       int i=1;
		        while(n>0)
		        {
	                  if(i>k)
	                    i=1;
		              System.out.print(i+" ");
		              i++;
		              n--;
		        }
		        System.out.println();
		    }
		}
	}
	
	
}
