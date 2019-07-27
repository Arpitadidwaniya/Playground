import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in =new Scanner (System.in);
      int n = in.nextInt();
      int a[]= new int[n];
      int m=0;
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int k= in.nextInt();
       for(int i=1;i<=k;i++)
      {
         m=max(a,n);
         if(i==k)
         {
           System.out.print(a[m]);
           break;
         }
         a[m]=0;
       }
    }
      public static int max(int a[],int n)
      {
        int max=0;
        for(int i=0;i<n;i++)
        {
          if(a[max]<a[i])
          {
            max=i;
          }
        }
        return max;
      }
      
    
}