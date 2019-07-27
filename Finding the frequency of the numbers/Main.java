import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner in =new Scanner (System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int a[]= new int[n];
       for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
    int f[]= new int[k+1];
       for(int i=0;i<=k;i++)
      {
        f[i]=0;
      }
    
       for(int i=0;i<n;i++)
      {
          for(int j=1;j<=k;j++)
      {
             
        if(a[i]==j)
        {
          f[j]++;
       
          break;
        }
            
    }
       }
      for(int i=1;i<=k;i++)
      {
        System.out.println(i+" "+f[i]);
      }
    }
}