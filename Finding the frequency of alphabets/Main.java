import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here 
      Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      StringBuilder sb= new StringBuilder(str);
      int a[]=new int [70];
      int l=sb.length();
      char ch;
      for(int i=0;i<70;i++)
      {
        a[i]=0;
      }
      for(int i=0;i<=l-1;i++)
      {
        if((sb.charAt(i) >='A')&&(sb.charAt(i) <='Z'))
        {
          int n = sb.charAt(i)-'A';
          ch=(char)(n+'a');
          sb.setCharAt(i,ch);
        
        }
        if(sb.charAt(i) >='a'&&sb.charAt(i)<= 'z')
        {
          a[sb.charAt(i)-'a']++;
       
        }
      }
      for(int i=0;i<=l-1;i++)
      {
        if(a[sb.charAt(i)-'a']!=0)
        {
          System.out.print(sb.charAt(i)+""+a[sb.charAt(i)-'a']+" ");
          a[sb.charAt(i)-'a']=0;
        }
      }
    }
}