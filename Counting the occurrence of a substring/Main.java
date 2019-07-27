import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
     Scanner scan = new Scanner (System.in);
      String str1= scan.nextLine();
    String str2= scan.nextLine();
      int m= str1.length();
     int n= str2.length();
    boolean match=true;
    int c=0;
    for(int i=0; i<=m-n;i++)
    {
      match=true;
      for(int j=0;j<n;j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          match=false;
        }
  } 
      if(match==true)
      {
        c++;
      }
    }
    System.out.println(c);
  }
}
