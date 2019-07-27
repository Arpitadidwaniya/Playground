import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner (System.in);
          String st = sc.nextLine();
        String str = sc.nextLine();
        int n = sc.nextInt();
      String s = st.replace(st,str);
      String a[] = s.split(" ",n);
      for( String r :a)
      {
        System.out.println(r);
      }
      
        
      
    }
}