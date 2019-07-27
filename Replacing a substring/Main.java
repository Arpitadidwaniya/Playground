import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
       Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
   String st = scan.nextLine();
        String s = scan.nextLine();
      
      System.out.print(str.replace(st,s));
    }
}