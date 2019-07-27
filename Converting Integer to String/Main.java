import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
       Scanner in= new Scanner (System.in);
    int n = in.nextInt();
    int temp=n,c=0;
    if(n<0)
    {
      n=n*-1;}
    do
    {
      c++;n=n/10;
    
    }while(n>0);
    if(temp<0)
    {
    c=c+1;
    }
    char a[]=new char[c];
    if(temp<0)
    {
      temp=temp * -1;
      a[0] ='-';
      //System.out.println(a[0]);
    }
    c=c-1;
    while(temp>0)
    {
      char ch = (char)(temp%10 + '0');
      a[c]=ch;
      temp =temp/10;
      c--;
    }
    System.out.print(a);
    
}
}
  