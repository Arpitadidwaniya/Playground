import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
   Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int a[]= new int[n];
     
    for(int i= 0; i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int f[] =new int[n];
    int k=0,max=0,maxi=a[0];
      
  
    for(int i=1;i<=n-1;i++)
    {
      for(int j=i+1;j<=n-1;j++)
      {
      if(a[i] == a[j])
      {
        k++;
      }
      } 
      if(k>max)
      {
        maxi=a[i];
      max=k;
    k=0;
    }
    }
      System.out.print(maxi);
    
  }
    }
 

    