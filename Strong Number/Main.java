import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int m = in.nextInt();
  
      int h =m;
      int k=0  , sum =0;
  
      
      while(m != 0)
      {
        k = m%10;
        m = m/ 10;
        int l = 1;
      for(int i=1; i<= k ;i++)
      {
        l= l*i;
}
        sum = sum +l;
      }
      if( sum == h)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
        
        
