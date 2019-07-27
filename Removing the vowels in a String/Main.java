import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    String s,r;
    Scanner in =new Scanner (System.in);
    s = in.nextLine();
    r= remove(s);
    System.out.print(r);
  }
  public static String remove(String s)
  {
    String f="";
    for(int i=0;i<s.length();i++)
    {
    if(!vowel(Character.toLowerCase(s.charAt(i))))
       {
         f= f+s.charAt(i);
       }
       }
       return f;
       }
       public static boolean vowel(char c)
       {
         String a="aeiou";
         for(int i=0;i<5;i++)
         {
           if(c==a.charAt(i))
           {
             return true;
           }
           
         }
         return false;
       }
}