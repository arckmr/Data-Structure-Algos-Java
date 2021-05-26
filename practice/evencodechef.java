import java.io.*;
 import java.lang.*;
import java.util.*;
class evencodechef

{public static void main (String[] args)throws java.lang.Exception
	{int n=0;int s=0;int t=0;int j;int k=0;int sum=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) 
	      t=sc.nextInt();
	      for (int i=0;i<t;i++){
	          if(sc.hasNextInt()){
	           s=sc.nextInt(); 
	           n=sc.nextInt();sum=0;
	           }ArrayList<Integer> arr = new ArrayList<Integer>(); 
	          if(n%2==0)
	          {
	              for(j=n;j>0;j--)
	              {
	                  if(j%2==0){
	                      if(j<=s)
	                      { sum=sum+(s/j);
	                          s=s-(j*(s/j)); 
	                       }
	                  }
	               }
	               
	               }
	               System.out.println(sum+s);
	           }
	          
	       }
	}
