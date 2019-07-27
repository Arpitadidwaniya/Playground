import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
       Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print(sum(num));
  }
    public static int sum(int num)
    {
      if(num> 0)
        return num + sum (num -1 );
      else
    return 0;
    }
  }
    