import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
         Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
      int c=0,m =1;
      while(c<e)
      {
        m = m*b;
        ++c;
      }
      System.out.print(m);
      
    }
}