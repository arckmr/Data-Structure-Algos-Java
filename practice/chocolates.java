import java.io.*;
 import java.lang.*;
import java.util.*;
class chocolates

{public static void main (String[] args)throws java.lang.Exception
	{int n=0;int s=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	       {
	           n=sc.nextInt();
	           s=sc.nextInt();
	       }
	       if(s%n==0)
	       System.out.println("yes");
	       else
	       System.out.println("n");
	   }
}