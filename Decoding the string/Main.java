import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str= in.nextLine();
    StringBuilder text = new StringBuilder(str); 
    int s=in.nextInt();
    int l =text.length();
    for(int i=0;i<=l-1;i++)
    {
      char ch = text.charAt(i);
      if(ch>='A'&&ch<='Z')
      {
        ch=(char)(ch-s);
        if(ch<'A')
        {
          ch= (char)(ch + 26);
        }
      }
       if(ch>='a'&&ch<='z')
      {
        ch=(char)(ch-s);
        if(ch<'a')
        {
          ch= (char)(ch + 26);
        }
      }
      text.setCharAt(i,ch);
    }
    System.out.print(text);
    
  }
}