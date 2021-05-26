import java.io.*;
 import java.lang.*;
import java.util.*;
class covid
{public static void main (String[] args)throws java.lang.Exception
	{int y=0;int k=0;int n=0;int x=0;int t=0;int s=0;int s1;int s2;int s3;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	      t=sc.nextInt(); 
	      for (int i=0;i<t;i++){s=0;s1=0;s2=0;s3=0;
	        if(sc.hasNextInt()) {         
	      n=sc.nextInt();
	      k=sc.nextInt();
	      x=sc.nextInt();
	      y=sc.nextInt();}
	      if(k!=0&&x!=y){
	      s1=(n-x)/k;
	      s2=s1*k;
	      s3=(n-x)-s2;
	      s=k-s3;  
	      if(x%(s+k)==0)
	      System.out.println("NO");
	      else 
	       System.out.println("YES");}
	       else if(k==0)
	       {if(x==y)
	        {System.out.println("YES");}
	        else
	        System.out.println("NO");}
	        else if(x==y)
	        {System.out.println("YES");}
	   }
	 }
}