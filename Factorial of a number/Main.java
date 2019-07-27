import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int l=1;
      for(int i=1;i<=n;i++)
      {
        l=l*i;
	}
      System.out.println(l);
    }
}