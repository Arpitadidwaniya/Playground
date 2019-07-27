import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int a[]= new int[n];
    for(int i= 0; i<n;i++)
    {
      a[i]=in.nextInt();
    }
    System.out.print(max (a,n));
  }
  public static int max(int a[],int n)
  {
    int rsum=a[0], maxsum=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
      {
        rsum+=a[i];
      }
      else
      {
        rsum= a[i];
      }
      if(rsum> maxsum)
      {
        maxsum = rsum;
      }
    }
    return maxsum;
  }
}
