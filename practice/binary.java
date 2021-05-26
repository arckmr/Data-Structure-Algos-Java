import java.util.Scanner;
public class binary{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);int i;String comp="";
        int t=sc.nextInt();String s="";long j;long a[]=new long[t];
        for(i=0;i<t;i++){
        int n=sc.nextInt();
        long d=(long)(Math.pow(10,n))-1;
        for( j=d;j>0;j--)
        {  s="";
            for (long k=j;k!=0;k=k/10)
          {
           long m=j%10;
            while(m!=0)
            {
               long r=m%2;
                s=s+Long.toString(r);
                m=m/2;               
                
            }
          }
            String st=s.substring(0,(s.length()-n));
            if (j==d)
            {
                comp=st;
            }
            if(!(st.equals(comp)))
            {
                break;
            }
        }
        a[i]=j;
        
     }
     for(i=0;i<t;i++){
         System.out.println(a[i]);
        }
 }
    
}