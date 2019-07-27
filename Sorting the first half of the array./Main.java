import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    insert(n,list);
  }
  public static void insert(int n,int list[])
  {
    for(int i=1;i<n/2;i++)
    {
      int k = list[i];
      int p=i-1;
      while((p>=0)&&(list[p]>k))
      {
        list[p+1]=list[p];
        p--;
      }
      list[p+1]=k;
    }
    for(int j=0;j<n;j++)
    {
      System.out.print(list[j]+" ");
    }
    
    
  }
}