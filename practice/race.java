import java.io.*;
 import java.lang.*;
import java.util.*;
class race
{public static void main (String[] args)throws java.lang.Exception
	{int s1=0;int s2=0;int n=0;int t=0;int r=0;int c=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	       t=sc.nextInt(); 
	        for (int i=0;i<t;i++){
	           
	            if(sc.hasNextInt()) 
	            r=sc.nextInt(); 
	              for (int j=1;j<5;j++){
	                if(sc.hasNextInt()) 
	                c=sc.nextInt();
	                if(c>r){n=1;
	                }
	                
	               }
	               if(n==1)
	               System.out.println(-1);
	               else
	               System.out.println("Champions");
	           }
	   }
}