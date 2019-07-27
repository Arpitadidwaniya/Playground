import java.util.Scanner;
class Main
{
  public static void rw(String s)
  {
    //your code here;
    String [] w = s.split(" ");
    String r ="";
    int n = w.length;
    for(int i=0; i < n;i++)
    {
      String wo = w[i];
      String rw = "";
      for(int j=wo.length()-1;j>=0;j--)
      {
        rw=rw+wo.charAt(j);
      }
      r=r+rw+" ";
    }
    System.out.println(r);
  }
  public static void main(String [] args)
  {
    Scanner sc =new Scanner(System.in);
    String s = sc.nextLine();
    rw(s);
  
    
  }
}