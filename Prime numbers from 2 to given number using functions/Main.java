import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2;i<n;i++)
      {
        div(i);
        
      }
    }
      public static void div(int a)
      {
        int temp=0;
        for(int j=1;j<=a;j++)
        {
          int b = a%j;
          if(b==0)
          {
            temp++;
          }
        }
        if(temp==2)
        {
          System.out.print(a);
          System.out.print("\n");
        }
	}
}