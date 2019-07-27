import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
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
  {int min=0;
    if(r>s)
    {
       min =s;
    }
    else
    {
      min =r;
    }
    while(min >=0)
    {
    if((r%min==0)&&(s%min==0))
    {
      return min;
      
     } min--;
    }return 0;
  }
 

	}
