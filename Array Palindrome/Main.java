import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      int f=0,b=n-1,c=0;
      for(int i=0;i<n;i++)
      {
        a[i]= in.nextInt();
      }
      while(f<b)
      {
       
        if(a[f]!=a[b])
        {
          c=1;
      
          break;
        }
        f++;b--;
      }
      if(c==0)
      {
        System.out.println("Yes");
      }
     else
      {
        System.out.println("No");
      }
    }
}