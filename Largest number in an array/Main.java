import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int m[]=new int[n];
      for(int i=0;i<n;i++)
      {
        m[i]=in.nextInt();
      }
     int max=0; 
      for(int i=0;i<n;i++)
      {
  max = loop(max,m[i],n);
      }
      
      System.out.print(max);
    }
      
      public static int loop(int o,int p,int u)
      {
        for(int i=0;i<u;i++)
      {
        if(p>o)
        {
        return p;
        }
      
      else
      {return o;
      }
      }
        return 0;
    }
}