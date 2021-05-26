import java.io.*;
 import java.lang.*;
import java.util.*;
class zenny
{public static void main (String[] args)throws java.lang.Exception
	{int s1=0;int s2=0;int n=0;int t=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	       t=sc.nextInt(); 
	     
	     for (int i=0;i<t;i++){
	          if(sc.hasNextInt()) 
	         n=sc.nextInt(); int arr[]=new int[n];
	        for (int j=0;j<n;j++)
	        {
	            if(sc.hasNextInt()) 
	            arr[j] =sc.nextInt(); 
	            if(arr[j]>=0)
	            s1=s1+arr[j];
	            else
	             s2=s2+arr[j];
	           }
	           System.out.print(s1);
	            System.out.print(s2);
	             System.out.println();
	       }
	   }
}