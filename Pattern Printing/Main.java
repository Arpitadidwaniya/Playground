import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
         Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
       int c = sc.nextInt();
      for( int i=1;i<=r; i++)
      {
        for(int j=1;j<i;j++)
        {
          int k = c-(j-1);
          System.out.print(k);
        }
        for(int j=1;j<=c-(i-1);j++)
        {
       
          System.out.print(c-(i-1));
        }
      
        System.out.println();
        }
        
    }
}