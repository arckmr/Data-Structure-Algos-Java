import java.io.*;
 import java.lang.*;
import java.util.*;
class matrix
{public static void main (String[] args)throws java.lang.Exception
	{int m=0;int c=0;int n=0;int x=0;int t=0;int y=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	       t=sc.nextInt();
	        for (int i=0;i<t;i++){
	            if(sc.hasNextInt()) {n=sc.nextInt();
	        m=sc.nextInt();
	        x=sc.nextInt();
	        y=sc.nextInt();}
	        if(m%2==0)
	        c=m/2;
	        else
	        c=(m/2)+1;
	        System.out.println(c*y*n);
	       }
	                
	               }
	           }
	   
