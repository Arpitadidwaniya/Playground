import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner in =new Scanner(System.in);
    int n =in.nextInt();
    int m[]=new int[n];
      int s=0;
    for(int i=0;i<n;i++)
    {
      m[i]=in.nextInt();
        }
      int v= in.nextInt();
       for(int i=0;i<n-2;i++)
    {
       for(int j=0;j<n;j++)
    {
      s=m[i]+m[j];
         if(s==v)
         {
           System.out.println(m[i]+", "+m[j]);
         }
       }
       }
        }
        }
