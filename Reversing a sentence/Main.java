import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
           // Type your code here
      Scanner scan = new Scanner (System.in);
      String str= scan.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int n= sb.length();
      int f=0,b=n-1;
      
      fun(sb,f,b);
      f=0;
      for(int i=0;i<n-1;i++)
      {
        if(sb.charAt(i)==' ')
        {
          fun(sb,f,i-1);
          f=i+1;
        }
        else if(i==n-1)
        {
          fun(sb,f,i);
        }
            
    }
      System.out.println(sb);
    }

    // Function to reverse a string
    public static void fun(StringBuilder sy, int fa, int ba)
    {
      char ch;
        
      while(fa<ba)
      {
        ch=sy.charAt(fa);
        sy.setCharAt(fa,sy.charAt(ba));
        sy.setCharAt(ba,ch);
        fa++;
        ba--;
        
    }
}
}