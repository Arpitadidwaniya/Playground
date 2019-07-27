import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
   // int i,j;
    Scanner in = new Scanner(System.in);
        
        int r = in.nextInt();
        int c = in.nextInt();
        int a[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }
    upper(r,c,a);
  }
  public static void upper(int r,int c,int[][] a)
  {
    int i,j,k;
    
        for( k = 0; k < c; k++){
            for(i = 0, j = k; j < c; i++,j++){
                System.out.print(a[i][j]+" ");
            }
          
        }
  }
}