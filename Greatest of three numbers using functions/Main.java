import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner in =new Scanner(System.in);
      int a =in.nextInt();
      int b =in.nextInt();
      int x =in.nextInt();
      int m = c(a,b);
      int y = c(m,x);
      System.out.print(y);
      
	}
  public static int c(int r,int s)
  {
    if(r>s)
    {
       return r;
    }
    else
    {
      return s;
    }
    
	}
}