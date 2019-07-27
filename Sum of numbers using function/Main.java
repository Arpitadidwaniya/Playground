import java.util.Scanner;
class Main{
  public static int loop(int g)
  {
    int sum=0;
    for(int i=1;i<=g;i++)
    {
      sum = sum + i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = loop(n);
      System.out.print(m);
	}
}