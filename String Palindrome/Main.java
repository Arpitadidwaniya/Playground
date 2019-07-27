import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner (System.in);
      String str= scan.nextLine();
      int n= str.length();
      int f=0, b=n-1;
      boolean match=true;
      while(f<b)
      {
        if(str.charAt(f)!= str.charAt(b))
        {
          match=false;
          break;
        }
        f++;
        b--;
    } 
      if(match==true)
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
}
    }
}