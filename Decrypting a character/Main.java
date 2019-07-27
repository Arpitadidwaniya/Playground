import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key =in.nextInt();
      if(ch>='a'&& ch<='z')
      {
      int num='z'-ch;
      int k=(num+key)%26;
      char cha = (char)('z'-k);
      System.out.println(cha);
      
    }
     else if(ch>='A'&& ch<='Z')
      {
      int num='Z'-ch;
      int k=(num+key)%26;
      
      char P = (char)('Z'-k);
      System.out.println(P);
      
    }
    }
}