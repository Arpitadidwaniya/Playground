import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in =new Scanner(System.in);
    int n =in.nextInt();
    int m[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      m[i]=in.nextInt();
  	}
    int r=in.nextInt();
    odd(m,n,r);
    even(m,n,r);
     for(int i=0;i<=n-1;i++)
    {
      System.out.print(m[i]+" ");
  	}
      }
    public static void odd(int m[],int n,int r)
    {
      int o=0,e=0,temp=0;
      if(n%2==0)
      {
        e=n-2;
      }
      else
      {e=n-1;}
      for(int i=1;i<=r;i++)
      {
        temp=m[e];
      
        for(int j=e;j>0;j=j-2)
        {
          m[j]=m[j-2];
           
        }
        m[o]=temp;
      
      }
    }
     public static void even(int m[],int n,int r)
    {
      int o=1,e=0,temp=0;
      if(n%2==0)
      {
        e=n-1;
      }
      else
      {e=n-2;}
      for(int i=1;i<=r;i++)
      {
        temp=m[o];
        for(int j=o;j<e;j=j+2)
        {
          m[j]=m[j+2];
        }
        m[e]=temp;
      }
    }
  }
