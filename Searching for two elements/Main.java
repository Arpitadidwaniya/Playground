import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int m[]=new int[n];
      for(int i=0;i<n;i++)
      {
        m[i]=in.nextInt();
      }
      int s =in.nextInt();
      int c= in.nextInt();
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(m[i]==s)
        {
          System.out.print(i);
          j++;
        }
      }
      if(j==0)
      {System.out.print("-1");
      }
      System.out.print("\n");
      j=0;
       for(int i=0;i<n;i++)
      {
        if(m[i]==c)
        {
          System.out.print(i);
          j++;
        }
      }
      if(j==0)
      {System.out.print("-1");
      }
      
    }
}