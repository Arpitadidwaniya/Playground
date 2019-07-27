import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m[]= new int [n];
    int c=0;
    int s=0;
    int sum=0;
    for(int i=0;i<=n-1;i++)
    {
      m[i]= in.nextInt();
    }
    sum = m[0]+m[1]+m[2];
    
    for(int i=3;i<=n-1;i=i+3)
    {
      s= m[i]+m[i+1]+m[i+2];
    
      if(sum == s)
      {
        c=1;
      }
    }
    if(c==0)
    {System.out.println("Not a Perfect Batch");
    }
    else
    {
      System.out.println("Perfect Batch");
    }
  }
}