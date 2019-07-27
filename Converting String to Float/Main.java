import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan= new Scanner (System.in);
    String st = scan.nextLine();
    double a=0,b=0;
    int n= st.length(),flag=0,k=0;
    while(k<n)
    {
      if(st.charAt(k)=='.')
      {
        flag=1;
      }
      k++;
    }
    if(flag==1)
    {
      for(int i =n-1;st.charAt(i)!='.';i--)
      {
        a=a/10+(st.charAt(i)-'0');
      }
      a=a/10;
      for(int i =0;st.charAt(i)!='.';i++)
      {
        b= b*10 + (st.charAt(i)-'0');
      }
    }
    else
    {
    for(int i =0;i<n;i++)
      {
        b= b*10 + (st.charAt(i)-'0');
      }
    }
    double sum = a+b;
    System.out.printf("%.6f",sum);
  }
}