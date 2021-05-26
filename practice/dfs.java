import java.util.*;
public class dfs

{
    static void print(int arr[][],int v,int sv,boolean visited[])
    {
        System.out.println(sv);
        visited[sv]=true;
        for(int i=0;i<v;i++)
        {
            if(arr[sv][i]==1)
            {if(visited[i]==true)
                continue;
                else
                print(arr,v,i,visited);
            }
        }
    }
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();int i=0;
        int e=sc.nextInt();int[][] arr=new int[v][v];
        for(i=0;i<v;i++)
        {for(int j=0;j<v;j++)
           arr[i][j]=0;
        }int f,s;
         for(i=0;i<e;i++)
         { f=sc.nextInt();
           s=sc.nextInt();
           arr[f][s]=1;
           arr[s][f]=1;            
          }
         boolean visited[]=new boolean[v];
          dfs obj=new dfs();int sv=0;
          dfs.print(arr,v,sv,visited);
        }           
            
        
        }
            
        
