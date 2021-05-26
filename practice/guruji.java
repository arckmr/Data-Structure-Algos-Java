import java.io.*;
 import java.lang.*;
import java.util.*;
class guruji
{public static void main (String[] args)throws java.lang.Exception
	{int n=0;int t=0;int s=0;int c=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	      t=sc.nextInt(); 
	      for (int i=0;i<t;i++){
	           if(sc.hasNextInt()) 
	           n=sc.nextInt();s=0;c=0;
	           if(n==0)
	           System.out.println(0);
	           else{
	           for(int j=1;j<=n;j++)
	           {
	               if(s!=j&&s+j<n){
	               s=s+j;
	               c++;}
	               else if(s+j==n)
	               break;
	              else if(s+j>n){
	              c++;break;}
	               
	               
	              
	           }}
	            System.out.println(c);
	      }
 }
}