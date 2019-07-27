import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int f[]=new int[n];
      int c=1;
      for(int i=0;i<n;i++)
      {
        a[i]= in.nextInt();
      }
       for(int i=0;i<n;i++)
      {
        f[i]= c;
         c++;
      }
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
      {
            if(a[i]==f[j])
            {
              f[j]=0;
            }
          }
      }
        for(int i=0;i<n;i++)
      {
          if(f[i]!=0)
          {
            System.out.print(f[i]);
          }
        }
      
    }
}