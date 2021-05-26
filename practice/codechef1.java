import java.io.*;
import java.util.Scanner;
class codechef1
{
     public static void main(String args[])
     { 
          Scanner sc = new Scanner(System. in);
          int c=sc.nextInt();
          for(int j=0;j<c;j++){int a=1;
          int k=sc.nextInt();int n=k;int t=0;
          while(n!=0)
          {
              int R=n%10;
              for(int i=1;i<9;i++)
              {
                  if((R-i)!=7){
                  R=R-i;break;
                }
                }
                 t=t+R*a;  
                 a*=10;
                 n=n/10;
            }
            System.out.println(t);
            System.out.println(k-t);
      }
    }
}