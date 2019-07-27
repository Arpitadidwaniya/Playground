import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m[]= new int [n];
    int c=0,k=0;
    for(int i=0;i<=n-1;i++)
    {
      m[i]= in.nextInt();
    }
    for(int i=0; i<=n-1;i++)
    {
      if(m[i]>c)
      {
        c=m[i];
        k=i;
      }
    }
      System.out.println(k);
    
  
  }
}