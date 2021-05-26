import java.io.*;
 import java.lang.*;
import java.util.*;
class comp
{public static void main (String[] args)throws java.lang.Exception
	{int a=0;int d=0;int k=0;int n=0;int inc=0;int t=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	      t=sc.nextInt(); 
	     
	     for (int i=0;i<t;i++){
	        if(sc.hasNextInt()) {         
	      a=sc.nextInt();
	      d=sc.nextInt();
	      k=sc.nextInt();
	      n=sc.nextInt();
	      inc=sc.nextInt();
	   }
	   sc.close();
	     
	         for (int j=2;j<=n;j++)
	         { a=a+d;
	                 
	             if (j%k==0)
	             {
	                 d+=inc;
	                
	               }
	               
	                //System.out.print(d+" ");
	           
	           }System.out.print(a+" ");
	       }
	}
	}
