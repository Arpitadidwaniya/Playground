import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a=(n%10)*100;
    int b= n/10;
    int c=(b%10)*10;
    int d=b/10;
    int sum=a+c+d;
    System.out.println(sum);
  }
}