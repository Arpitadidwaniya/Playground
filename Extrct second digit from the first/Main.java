import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
     
      int count=0;
      
      int k =n;
      while(n !=0)
      {
         n=n/10;
         count=count +1 ;
        
	}
      int i = count;
      count =0 ;
      while(count < i-2)
      {
          k = k/10;
        count=count +1 ;
        
	}
      int y = k %10;
      
      System.out.println(y);
    }
	}
