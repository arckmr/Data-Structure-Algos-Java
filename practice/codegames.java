import java.io.*;
 import java.lang.*;
import java.util.*;
class codegames


{public static void main (String[] args)throws java.lang.Exception
	{int n=0;String s="";int c=0;int f=0;
	       Scanner sc = new Scanner(System. in); 
	       if(sc.hasNextInt()) {
	         n=sc.nextInt();
	         	       }
	         for(int j=0;j<n;j++){
	         sc.nextLine();
                 s=sc.nextLine();
	       for(int i=0;i<s.length();i++)
	   {
	       if(s.charAt(i)=='V')
	       c++;
	       else
	       f++;
	   }
	   if(c>f)
	   System.out.println("Virat");
	   else if(c<f)
	   System.out.println("Harshit");
	   else
	   System.out.println("Friendship");
	   f=0;c=0;
	   }
}
} 
