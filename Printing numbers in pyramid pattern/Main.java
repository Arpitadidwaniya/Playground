import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
          Scanner in = new Scanner(System.in);
      int n = in.nextInt();
  int k=1;
      for(int i=1;i<=n;i++)
      {
        for(int p =1;p<=n-i;p++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print(k + " ");
          k++;
        }
        System.out.print("\n");
      }
}
}
