import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in =new Scanner(System.in);
    int n =in.nextInt();
    int m[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      m[i]=in.nextInt();
  	}
      zero(m,n);
       for(int i=0;i<=n-1;i++)
    {
      System.out.print(m[i]+" ");
  	}
    }
  
    public static void zero(int m[],int n)
    {
      int c=0,temp=0;
      for(int i=0;i<=n-1;i++)
      {
        if(m[i]!=0)
        {
          temp=m[i];
          m[i]=m[c];
          m[c]=temp;
          c++;
        }
      }
    }
}