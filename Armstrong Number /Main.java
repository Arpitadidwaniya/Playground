import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m =n;
      int h =m;
      int k=0  , sum =0;
      int count =0;
      while(n > 10)
      {
        n = n/10;
        count++;
        
	}
      
      while(m != 0)
      {
        k = m%10;
        m = m/ 10;
        int l = 1;
      for(int i=1; i<= count + 1 ;i++)
      {
        l= l*k;
}
        sum = sum +l;
      }
      if( sum == h)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
    }
}
        
        