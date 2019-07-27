import java.util.Scanner;
class Main
{
  public static int square(int g)
  {
    int s =g*g;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = square( n );
      System.out.print(m);
	} 
}