import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
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
    int j=0, maxsum=0;
    for(int i=0;i<=n-1;i++)
    {
      if(a[i] == 1)
      {
        j++;
      }
      else if (a[i]==0||i==n-1)
      {
        if(j> maxsum)
      {
        maxsum = j;
      }
        j=0;
    }
    
  }
    return maxsum;
}
}

    