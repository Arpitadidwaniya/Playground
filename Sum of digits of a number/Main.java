import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n =in.nextInt();
      int sum =0;
      int m =0;
      while(n !=0)
      {
          m= n%10;
          n =n/10;
         sum =sum + m;
	}
      System.out.println(sum);
}
}