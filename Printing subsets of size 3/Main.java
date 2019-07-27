import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in =new Scanner(System.in);
    int n =in.nextInt();
    int m[]=new int[n];
    for(int i=0;i<n;i++)
    {
      m[i]=in.nextInt();
    }
     for(int k=0;k<=n-2;k++)
    {
        for(int j=k+1;j<=n-1;j++)
    {
           for(int i=j+1;i<=n-1;i++)
    {
      System.out.print("("+m[k]+", "+m[j]+", "+m[i]+") ");
    }
        }
       System.out.print("\n");
     }
  }
}
          
          
          
          
          
          
          
          
          
          
    